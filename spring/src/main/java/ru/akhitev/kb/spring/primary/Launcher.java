package ru.akhitev.kb.spring.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("spring/primary/beans.xml");
        context.getBean("patrol");
    }
}
