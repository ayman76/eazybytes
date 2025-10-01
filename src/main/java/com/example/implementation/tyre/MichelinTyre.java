package com.example.implementation.tyre;

import com.example.inteface.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre implements Tyre {

    @Override
    public String rotate() {
        return "Michelin tyre rotate";
    }
}
