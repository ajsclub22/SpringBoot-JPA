package com.example.jdbc.dao;

import com.example.jdbc.model.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HibernateDao {
   @Autowired
   private EntityManager manager;
   @Transactional
   public void insert(Employee emp){
       Session sess = manager.unwrap(Session.class);
       sess.save(emp);
       System.out.println("in svae");
   }


}
