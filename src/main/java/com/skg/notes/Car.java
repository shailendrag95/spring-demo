package com.skg.notes;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine=engine;
    }
     void check(){
        engine.check();
        System.out.println("car running");
    }
}
