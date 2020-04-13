package component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext applicationContext;
    private String name;

    @Override
    public void setBeanName(String name) {
        this.name=name;
        System.out.println("beanName:"+this.name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("applicationContextName:"+this.applicationContext);
    }
}
