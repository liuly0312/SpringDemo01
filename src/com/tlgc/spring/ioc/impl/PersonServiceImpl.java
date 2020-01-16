package com.tlgc.spring.ioc.impl;

import com.tlgc.spring.dao.PersonDao;
import com.tlgc.spring.ioc.PersonService;

public class PersonServiceImpl implements PersonService {

    // 定义接口声明
    private PersonDao personDao;

    // 提供set()方法，用于依赖注入
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    // 实现PersonService接口的方法
    @Override
    public void addPerson() {
        personDao.add(); // 调用PersonDao中的add()方法
        System.out.println("addPerson()执行了...");
    }
}
