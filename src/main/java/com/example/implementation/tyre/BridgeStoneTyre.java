package com.example.implementation.tyre;

import com.example.inteface.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyre implements Tyre {

    @Override
    public String rotate() {
        return "Bridge Stone tyre rotate";
    }
}
