package quartz.test;

import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testQuartz {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext context=new ClassPathXmlApplicationContext("config/AppplicationContext.xml");
        StdScheduler stdScheduler= (StdScheduler) context.getBean("schedulerFactoryBean");
        stdScheduler.start();
    }
}
