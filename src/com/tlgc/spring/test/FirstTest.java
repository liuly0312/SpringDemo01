package com.tlgc.spring.test;

import com.tlgc.spring.dao.CustomerDao;
import com.tlgc.spring.dao.PersonDao;
import com.tlgc.spring.ioc.PersonService;
import com.tlgc.spring.jdk.MyBeanFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {

    @Test
    public void testl() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取personDao实例
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        // 调用 personDao 的 add ()方法
        personDao.add();
    }

    @Test
    public void test2() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取personService实例
        PersonService personService = (PersonService) applicationContext
                .getBean("personService");
        // 调用personService的addPerson()方法
        personService.addPerson();
    }

    @Test
    public void test3() {
        // 从工厂获得指定的内容（相当于spring获得，但此内容时代理对象）
        CustomerDao customerDao = MyBeanFactory.getBean();
        // 执行方法
        customerDao.add();
        customerDao.update();
        customerDao.delete();
        customerDao.find();
    }


}
