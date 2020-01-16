package com.tlgc.spring.dao.impl;

import com.tlgc.spring.dao.PersonDao;

public class PersonDaoImpl implements PersonDao {

    @Override
    public void add() {
        System.out.println("save()执行了...");
    }
}
