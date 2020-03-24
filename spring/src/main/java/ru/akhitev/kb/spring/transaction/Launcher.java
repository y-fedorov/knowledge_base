package ru.akhitev.kb.spring.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.akhitev.kb.spring.transaction.conf.DbConf;
import ru.akhitev.kb.spring.transaction.service.FleetService;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DbConf.class);
        FleetService fleetService = context.getBean(FleetService.class);
        fleetService.listAllFleets();
    }
}
