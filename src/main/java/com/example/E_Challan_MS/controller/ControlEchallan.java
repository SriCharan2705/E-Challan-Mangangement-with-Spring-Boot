package com.example.E_Challan_MS.controller;

import com.example.E_Challan_MS.model.ChallanDetails;
import com.example.E_Challan_MS.model.Owner;
import com.example.E_Challan_MS.model.Vehicle;
import com.example.E_Challan_MS.service.ServiceEchallan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/echallan")  // Base URL for all endpoints
public class ControlEchallan {

    @Autowired
    private ServiceEchallan se;

    // ----------- LOAD SAMPLE DATA (Hardcoded) -----------
    @GetMapping("/loadChallanData")
    public void loadChallanData() {
        se.loadSampleData();
    }

    // ----------- GET ALL -----------
    @GetMapping("/getAllChallans")
    public List<ChallanDetails> getAllChallans() {
        return se.getAllChallans();
    }

    @GetMapping("/getAllVehicles")
    public List<Vehicle> getAllVehicles() {
        return se.getAllVehicles();
    }

    @GetMapping("/getAllOwners")
    public List<Owner> getAllOwners() {
        return se.getAllOwners();
    }

    // ----------- POST (Dynamic Add) -----------

    @PostMapping("/addOwner")
    public Owner addOwner(@RequestBody Owner owner) {
        return se.addOwner(owner);
    }

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return se.addVehicle(vehicle);
    }

    @PostMapping("/createChallan")
    public ChallanDetails createChallan(@RequestBody ChallanDetails challan) {
        return se.createChallan(challan);
    }
}
