package com.defang.Service;

import com.defang.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author defang.yan
 * @date 19-3-21 上午10:45
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Map<Long, User> DATABASES = new HashMap<>();

    static {
        DATABASES.put(1L, new User(1L, "u1", "p1"));
        DATABASES.put(2L, new User(2L, "u2", "p2"));
        DATABASES.put(3L, new User(3L, "u3", "p3"));
    }

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @CachePut(value = "user", key = "#user.id")
    //CachePut 与 cacheable不相同的是 put 每次都会将设置缓存的key value set 进去，
    // 而Cacheable 则会检查若存在不会插入，直接从缓存中获取结果进行返回，
    // 否则才会执行并将返回结果存入指定的缓存中
    @Override
    public User saveOrUpdate(User user) {
        DATABASES.put(user.getId(), user);
        log.info("进入 saveOrUpdate 方法");
        return user;
    }

    @Cacheable(value = "user", key = "#id",condition = "#id.value>100")
    //condition 是为条件，当id的值>100的时候才进入get方法
    @Override
    public User get(Long id) {
        log.info("进入 get 方法");
        return DATABASES.get(id);
    }

    @CacheEvict(value = "user", key = "#id",allEntries = false)
//    次注解中 还有属性为 allEntries 全部清除 默认为false
    @Override
    public void delete(Long id) {
        DATABASES.remove(id);
        log.info("进入 delete 方法");
    }
// 注解介绍
// @Cacheable(根据方法的请求参数对其结果进行缓存)
//
//    key： 缓存的 key，可以为空，如果指定要按照 SpEL 表达式编写，如果不指定，则缺省按照方法的所有参数进行组合（如：@Cacheable(value="user",key="#userName")）
//    value： 缓存的名称，必须指定至少一个（如：@Cacheable(value="user") 或者 @Cacheable(value={"user1","use2"})）
//    condition： 缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存（如：@Cacheable(value = "user", key = "#id",condition = "#id < 10")）
//    @CachePut(根据方法的请求参数对其结果进行缓存，和 @Cacheable 不同的是，它每次都会触发真实方法的调用)
//
//    key： 同上
//    value： 同上
//    condition： 同上
//    @CachEvict(根据条件对缓存进行清空)
//
//    key： 同上
//    value： 同上
//    condition： 同上
//    allEntries： 是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存（如：@CacheEvict(value = "user", key = "#id", allEntries = true)）
//    beforeInvocation： 是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存（如：@CacheEvict(value = "user", key = "#id", beforeInvocation = true)）
}
