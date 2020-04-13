package config;

import entity.EnergyCar;
import entity.MyFactoryBean;
import entity.OilCar;
import entity.Speed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;

@Configuration
@ComponentScan({"entity","dao","service","controller","component","listener"})
@Import({MyImportSelector.class})
public class MyConfig {
//    @Bean
////    @Conditional(OilCarCondition.class)
//    public Car oilCar() {
//        return new OilCar();
//    }
//
//    @Bean
////    @Conditional(EnergyCarCondition.class)
//    public Car energyCar() {
//        return new EnergyCar();
//    }

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
//    @Primary
//    @Conditional(OilCarCondition.class)
    public OilCar oilCar(@Autowired Speed speed2) {//这里不能用@Resource,而且@Autowired居然可以按照实例名匹配
        OilCar o=new OilCar();
        o.setSpeed(speed2);
        o.setName("oilCar。。。。。");
        return o;
    }

    @Bean
//    @Conditional(EnergyCarCondition.class)
    public EnergyCar energyCar() {
        return new EnergyCar();
    }

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }

    @Bean
    public Speed speed() {
        return new Speed();
    }

    @Bean
    public Speed speed2() {
        Speed s=new Speed();
        s.setSpeed(new BigDecimal(Double.toString(444.4)));
        return s;
    }

}
