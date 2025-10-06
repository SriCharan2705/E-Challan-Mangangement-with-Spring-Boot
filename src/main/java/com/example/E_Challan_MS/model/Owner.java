package com.example.E_Challan_MS.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Owner")
public class Owner {
    @Id
    private String licenceNo;
    private String ownerName;
    private String gender;
    private String mobileNo;
    private String address;

    @OneToMany(mappedBy = "owner")
    @JsonManagedReference("owner-vehicles")
    private List<Vehicle> vehicles = new ArrayList<>();

    @OneToMany(mappedBy = "owner")
    @JsonManagedReference("owner-challans")
    private List<ChallanDetails> challans = new ArrayList<>();
}