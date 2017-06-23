package com.fanyank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanfeng-mac on 2017/6/20.
 */
@Configuration
public class Beans {
    @Bean(name = "car")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("红旗");
        car.setColor("红色");
        car.setMaxSpeed("100");
        return car;
    }
}
