package com.project.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shop.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
