package com.defang.demoforcache.entity;

import org.apache.ibatis.session.RowBounds;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;

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
//        ArrayList<Car> carArrayList = new ArrayList<>(3);
//        carArrayList.add(new Car("Benz", 5));
//        carArrayList.add(new Car("Benz", 6));
//        carArrayList.add(new Car("BMW", 5));
//        carArrayList.add(new Car("Audi", 4));
//        List<Car> collect = carArrayList.stream().filter(car -> car.b == 5).collect(Collectors.toList());
//        for (Car car : collect) {
//            System.out.println("name:" + car.name);
//        }
//        List<String> collect1 = carArrayList.stream().map(car -> car.getName()).collect(Collectors.toList());
//        System.out.println(collect1);
//        List<Car> collect2 = carArrayList.stream().sorted(Comparator.comparing(Car::getB).reversed()).collect(Collectors.toList());
//        List<Car> collect3 = carArrayList.stream().sorted(Comparator.comparing(Car::getB)).collect(Collectors.toList());
//        Map<Integer, List<Car>> collect4 = carArrayList.stream().collect(Collectors.groupingBy(carcar -> carcar.getB()));
//        System.out.println(collect4);
//        //降序升序 默认是正的升序，使用reversed方法后变为降序。reversed 颠倒。
//        System.out.println(collect2);
//        System.out.println(collect3);
        String json = "{ \n" +
                "  success : 0, \n" +
                "  errorMsg : \"错误消息\", \n" +
                "  data : { \n" +
                "   total : \"总记录数\", \n" +
                "   rows : [ { \n" +
                "    id : \"任务ID\", \n" +
                "    workName : \"任务名称\", \n" +
                "    assigneeName : \"经办人姓名\", \n" +
                "    name : \"流程步骤名称\", \n" +
                "    processInstanceInitiatorName : \"发起人\", \n" +
                "    processInstanceStartTime : \"发起时间\", \n" +
                "    createTime : \"到达时间\", \n" +
                "    dueDate : \"截止时间\" \n" +
                "   }, { \n" +
                "    id : \"ID\", \n" +
                "    workName : \"名称\", \n" +
                "    assigneeName : \"经办人\", \n" +
                "    name : \"流程\", \n" +
                "    processInstanceInitiatorName : \"发起人\", \n" +
                "    processInstanceStartTime : \"发起\", \n" +
                "    createTime : \"到达\", \n" +
                "    dueDate : \"截止\" \n" +
                "   } ] \n" +
                "  } \n" +
                " }";


        String files[] = json.split("\\\\nn");
        String[][] roots = new String[files.length][];
        System.out.println(files[0]);
        for (int i = 0; i < files.length; i++) {
            roots[i] = files[i].split("\\\\n");
            files[i] = null;
        }
        System.out.println(roots[0][0]);


//        jdbc数据库链接步骤
//                1、加载驱动   class.forname(driver 驱动路径)
//                2、数据库连接 DriverMannager.getConnection(数据库地址,数据库用户名,数据库密码)
//                3、创建statement对象,connection.createStatement
//                4、编写sql
//                5、执行sql execute

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Calendar instance = Calendar.getInstance();
        instance.set(i,0,1);
        instance.add(Calendar.DATE,-1);
        System.out.println(instance.get(Calendar.DATE));
    }

}
