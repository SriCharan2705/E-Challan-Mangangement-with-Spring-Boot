package model;

import jakarta.persistence.Id;

public class ChallanDetails {

    @Id
    private int challanId;
    private String vehicleNo;
    private String violation;
    private String location;
    private int fine;


    public int getChallanId() {
        return challanId;
    }

    public void setChallanId(int challanId) {
        this.challanId = challanId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "ChallanDetails{" +
                "challanId=" + challanId +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", violation='" + violation + '\'' +
                ", location='" + location + '\'' +
                ", fine=" + fine +
                '}';
    }
}
