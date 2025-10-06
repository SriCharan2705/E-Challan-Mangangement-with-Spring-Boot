package com.example.E_Challan_MS.service;

import com.example.E_Challan_MS.model.ChallanDetails;
import com.example.E_Challan_MS.model.Owner;
import com.example.E_Challan_MS.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.E_Challan_MS.repository.RepoChallanDetails;
import com.example.E_Challan_MS.repository.RepoOwner;
import com.example.E_Challan_MS.repository.RepoVehicle;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEchallan {

    @Autowired
    private RepoChallanDetails challanRepo;
    @Autowired
    private RepoOwner ownerRepo;
    @Autowired
    private RepoVehicle vehicleRepo;

    // ----------------- CRUD Methods -----------------

    public Owner addOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    public ChallanDetails createChallan(ChallanDetails challan) {
        return challanRepo.save(challan);
    }

    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepo.findAll();
    }

    public List<ChallanDetails> getAllChallans() {
        return challanRepo.findAll();
    }

    // ----------------- Bulk Load Sample -----------------

    public void loadSampleData() {
        Owner owner = new Owner();
        owner.setLicenceNo("WGL2703A001");
        owner.setOwnerName("Sri Charan");
        owner.setGender("Male");
        owner.setMobileNo("8008072341");
        owner.setAddress("Hanamkonda");

        ownerRepo.save(owner);

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNo("TS03ED2568");
        vehicle.setBrand("Pulsar");
        vehicle.setModel("150cc");
        vehicle.setColour("Black");
        vehicle.setOwner(owner);

        vehicleRepo.save(vehicle);

        ChallanDetails challan = new ChallanDetails();
        challan.setChallanId("202503001");
        challan.setViolation("No Helmet");
        challan.setLocation("Ashoka Circle");
        challan.setFine(200);
        challan.setVehicle(vehicle);
        challan.setOwner(owner);

        challanRepo.save(challan);
    }
}
