package com.example.jdbc.service;

import com.example.jdbc.dao.HibernateDao;
import com.example.jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private HibernateDao dao;

    @Override
    @Transactional
    public void insert(Employee emp) {

        dao.insert(emp);
    }
}
