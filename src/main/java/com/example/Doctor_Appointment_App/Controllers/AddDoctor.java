package com.example.Doctor_Appointment_App.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Data
public class AddDoctor {

    @JsonProperty("Name")
            @NotNull(message = "name is required")
    String doctorName;

    @JsonProperty("ID")
            @NotNull(message = "ID is required")
    String doctorID;

    @JsonProperty("Email")
            @Pattern(
                    regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}",
                    message = "Invalid email"
            )
    String doctorEmail;

    @JsonProperty("Speciality")
            @NotNull(message = "speciality is required")
    String doctorSpeciality;

    @JsonProperty("Degree")
            @NotNull(message = "degree is required")
    String doctorDegree;

    String experience;
    List<Contacts> contacts;

    public AddDoctor(String doctorName,
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
