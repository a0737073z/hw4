package com.example.springwebservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="member")
@NoArgsConstructor
public class User {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;
}
