package com.project.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shop.entity.TestEntity;
import com.project.shop.repository.TestRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {
    
    private final TestRepository testRepository;

    @GetMapping("/")
    public List<TestEntity> getTestPage() {
        return testRepository.findAll();
    }
    
}
