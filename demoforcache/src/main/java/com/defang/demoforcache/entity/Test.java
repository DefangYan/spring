package com.defang.demoforcache.entity;

import org.apache.ibatis.session.RowBounds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author defang.yan
 * @date 19-7-26 下午2:56
 */
public class Test {
//    class Benz extends car{
//        @Override
//        public void run() {
//            System.out.println("奔驰在跑");
//        }
//    }
    public static void main(String[] args) {
//        car car = new Benz();
//        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Car> carArrayList = new ArrayList<>(3);
        carArrayList.add(new Car("Benz", 5));
        carArrayList.add(new Car("Benz", 6));
        carArrayList.add(new Car("BMW", 5));
        carArrayList.add(new Car("Audi", 4));
        List<Car> collect = carArrayList.stream().filter(car -> car.b == 5).collect(Collectors.toList());
        for (Car car : collect) {
            System.out.println("name:" + car.name);
        }
        List<String> collect1 = carArrayList.stream().map(car -> car.getName()).collect(Collectors.toList());
        System.out.println(collect1);
        List<Car> collect2 = carArrayList.stream().sorted(Comparator.comparing(Car::getB).reversed()).collect(Collectors.toList());
        List<Car> collect3 = carArrayList.stream().sorted(Comparator.comparing(Car::getB)).collect(Collectors.toList());
        Map<Integer, List<Car>> collect4 = carArrayList.stream().collect(Collectors.groupingBy(carcar -> carcar.getB()));
        System.out.println(collect4);
        //降序升序 默认是正的升序，使用reversed方法后变为降序。reversed 颠倒。
        System.out.println(collect2);
        System.out.println(collect3);



//        jdbc数据库链接步骤
//                1、加载驱动   class.forname(driver 驱动路径)
//                2、数据库连接 DriverMannager.getConnection(数据库地址,数据库用户名,数据库密码)
//                3、创建statement对象,connection.createStatement
//                4、编写sql
//                5、执行sql execute



    }
}
