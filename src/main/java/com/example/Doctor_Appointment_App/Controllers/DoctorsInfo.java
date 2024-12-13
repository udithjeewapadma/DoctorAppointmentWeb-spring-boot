package com.example.Doctor_Appointment_App.Controllers;

import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorsInfo {


    //creating get request to get doctor info
    @GetMapping(value = "/doctors")
    private DoctorsList getDoctorsInfo(){
//        System.out.println("get doctors info");

        List<Doctors> doctors = new ArrayList<>();


        List<Contacts> contactsJohn = new ArrayList<>();
        contactsJohn.add(new Contacts("0727467743"));
        contactsJohn.add(new Contacts("0712034323"));

        List<Contacts> contactsIsiah = new ArrayList<>();
        contactsIsiah.add(new Contacts("0741720452"));
        contactsIsiah.add(new Contacts("0741720452"));


        doctors.add(new Doctors("John",
                "jslo342s",
                "john123@gmail.com",
                "Dermatology",
                "phD",
                "4 Years",contactsJohn));

        doctors.add(new Doctors(
                "Isiah",
                "ytur32",
                "isiah123@gmail.com",
                "Cardiology",
                "phD",
                "2 years",contactsIsiah));


        return new DoctorsList(doctors);
    }
    @PostMapping(value = "/doctors")
    public void addDoctors(@RequestBody @Valid AddDoctor addDoctor){
//        System.out.println("Adding doctor to the system");
        System.out.println(addDoctor.getDoctorName());
        System.out.println(addDoctor.getDoctorID());
        System.out.println(addDoctor.getDoctorEmail());
        System.out.println(addDoctor.getDoctorSpeciality());
        System.out.println(addDoctor.getDoctorDegree());
        System.out.println(addDoctor.getContacts());


    }
}
