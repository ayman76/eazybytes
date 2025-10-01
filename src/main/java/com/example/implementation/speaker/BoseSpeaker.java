package com.example.implementation.speaker;

import com.example.inteface.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {

    @Override
    public String makeSound() {
        return "Sound from Bose Speaker";
    }
}
