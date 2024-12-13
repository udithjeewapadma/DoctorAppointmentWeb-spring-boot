package com.example.Doctor_Appointment_App.Controllers;

import lombok.Data;

@Data
public class Contacts {

    String mobileNumber;

    public Contacts(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
