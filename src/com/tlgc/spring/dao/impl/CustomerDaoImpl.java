package com.tlgc.spring.dao.impl;

import com.tlgc.spring.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void add() {
        System.out.println("添加客户...");
    }

    @Override
    public void update() {
        System.out.println("update客户...");
    }

    @Override
    public void delete() {
        System.out.println("删除客户...");
    }

    @Override
    public void find() {
        System.out.println("find客户...");
    }
}
