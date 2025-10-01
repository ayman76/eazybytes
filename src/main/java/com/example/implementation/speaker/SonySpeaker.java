package com.example.implementation.speaker;

import com.example.inteface.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {

    @Override
    public String makeSound() {
        return "Sound from Sony Speaker";
    }
}
