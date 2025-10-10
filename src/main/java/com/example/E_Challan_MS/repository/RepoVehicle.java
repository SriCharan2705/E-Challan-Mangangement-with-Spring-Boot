package com.example.E_Challan_MS.repository;

import com.example.E_Challan_MS.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoVehicle extends JpaRepository<Vehicle,String> {
}
