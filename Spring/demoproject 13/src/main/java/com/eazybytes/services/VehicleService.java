package com.eazybytes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eazybytes.interfaces.Speakers;
import com.eazybytes.interfaces.Tyres;

@Service
public class VehicleService {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
