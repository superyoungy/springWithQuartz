package controller;

import entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("interfaceFindBeanProfile")
@Controller
public class InterfaceFindBean {
////    @Resource(name = "oilCar")
    //相当于有参构造
    @Qualifier("oilCar")//可以用接口实现类的@Primary代替
    @Autowired(required = true)
    Car o;

    public InterfaceFindBean() {
    }

    public Car getO() {
        return o;
    }

    public void setO(Car o) {
        this.o = o;
    }

}
