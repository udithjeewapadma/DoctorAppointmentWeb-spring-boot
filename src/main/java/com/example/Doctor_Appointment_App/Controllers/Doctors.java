package com.example.Doctor_Appointment_App.Controllers;

import lombok.Data;

import java.util.List;

@Data
public class Doctors {
    String doctorName;
    String doctorID;
    String doctorEmail;
    String doctorSpeciality;
    String doctorDegree;
    String experience;
    List<Contacts> contacts;

    public Doctors(String doctorName,
                   String doctorID,
                   String doctorEmail,
                   String doctorSpeciality,
                   String doctorDegree,
                   String experience,
                   List<Contacts> contacts) {
        this.doctorName = doctorName;
        this.doctorID = doctorID;
        this.doctorEmail = doctorEmail;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorDegree = doctorDegree;
        this.experience = experience;
        this.contacts = contacts;
    }
}
