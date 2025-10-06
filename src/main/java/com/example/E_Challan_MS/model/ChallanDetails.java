package com.example.E_Challan_MS.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Challan")
public class ChallanDetails {

    @Id
    private String challanId;
    private String violation;
    private String location;
    private int fine;

    @ManyToOne
    @JoinColumn(name = "vehicle_no", referencedColumnName = "vehicleNo")
    @JsonBackReference("vehicle-challans")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "licence_no", referencedColumnName = "licenceNo")
    @JsonBackReference("owner-challans")
    private Owner owner;
}