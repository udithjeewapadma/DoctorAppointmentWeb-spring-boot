package com.example.Doctor_Appointment_App.Controllers;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class DoctorsList {
    private List<Doctors> doctors;
}
