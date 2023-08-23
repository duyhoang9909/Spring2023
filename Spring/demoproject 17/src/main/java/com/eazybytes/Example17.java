package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import com.eazybytes.model.Song;
import com.eazybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example17 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
//        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
//        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }
}
