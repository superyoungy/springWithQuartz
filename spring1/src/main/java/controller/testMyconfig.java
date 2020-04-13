package controller;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testMyconfig {
/*
    注释无效，因为testMyconfig不在spring的管理下
    @Resource(name = "energyCar")
    private EnergyCar newCar2;
*/

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("config");
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//        System.out.println(context.getBean("myFactoryBean"));
//        System.out.println(context.getBean("&myFactoryBean"));
//
//        OilCar o= (OilCar) context.getBean("oilCar");
//        System.out.println(o.getName());
        context.publishEvent(new ApplicationEvent("myEvent..") {
        });
    }

}
