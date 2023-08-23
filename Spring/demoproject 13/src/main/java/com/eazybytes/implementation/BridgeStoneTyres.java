package com.eazybytes.implementation;

import com.eazybytes.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Moving vehicle with Bridge Stone Tyres";
    }
}
