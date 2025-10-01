package com.example.services;

import com.example.inteface.Speaker;
import com.example.inteface.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private final Speaker speaker;
    private final Tyre tyre;

    @Autowired
    public VehicleService(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public String makeSound(){
        return speaker.makeSound();
    }

    public String rotate(){
        return tyre.rotate();
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }


}
