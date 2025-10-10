package com.example.E_Challan_MS.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    private String vehicleNo;
    private String brand;
    private String model;
    private String colour;

    @ManyToOne
    @JoinColumn(name = "licence_no", referencedColumnName = "licenceNo")
    @JsonBackReference("owner-vehicles")
    private Owner owner;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    @JsonManagedReference("vehicle-challans")
    private List<ChallanDetails> challans = new ArrayList<>();
}
