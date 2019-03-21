package com.defang.eagle.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stu")
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    //TABLE： 使用一个特定的数据库表格来保存主键
    //SEQUENCE： 根据底层数据库的序列来生成主键，条件是数据库支持序列。这个值要与generator一起使用，generator 指定生成主键使用的生成器（可能是orcale中自己编写的序列）。
    //IDENTITY： 主键由数据库自动生成（主要是支持自动增长的数据库，如mysql）
    //AUTO： 主键由程序控制，也是GenerationType的默认值。
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "sex")
    private String sex;
}
