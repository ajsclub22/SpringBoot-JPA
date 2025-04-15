package com.example.jdbc.controller;
import com.example.jdbc.model.Employee;
import com.example.jdbc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {

    @Autowired
    private EmpService service;

    @PostMapping("/add")
    public void insert(@RequestBody Employee emp){
        service.insert(emp);
        System.out.println(emp);
    }
}
