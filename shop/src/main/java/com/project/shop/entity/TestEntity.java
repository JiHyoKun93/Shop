package com.project.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@Entity(name = "test")
public class TestEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String username;
    private int age;

    public TestEntity(int idx, String username, int age){
        this.username = username;
        this.age = age;
    }
}
