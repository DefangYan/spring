package com.defang.demoforcache.entity;

/**
 * @author defang.yan
 * @date 19-7-31 上午10:00
 */
public class Car {
    String name;
    int b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Car(String name, int b) {
        this.name = name;
        this.b = b;
    }
    public void run(){
        System.out.println("汽车再跑");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}
