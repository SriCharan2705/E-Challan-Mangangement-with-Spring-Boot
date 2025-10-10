CREATE TABLE
ChallanDetails(
    challanId VARCHAR(10) PRIMARY KEY,
    VehicleNo VARCHAR(8),
    violation VARCHAR(30),
    location VARCHAR(50).
    fine INTEGER
    );


 CREATE TABLE
 Vehicle(
    vehicleNo VARCHAR(10) PRIMARY KEY,
    FOREIGN KEY challanId REFERENCES ChallanDetails(challanId) ,
    rcNo VARCHAR(10),
    brand VARCHAR(10),
    model VARCHAR(10),
    colour VARCHAR(10)
 )

 CREATE TABLE
 Owner(
    licenceNo VARCHAR(10) PRIMARY KEY,
    FOREIGN KEY rcNo REFERENCES Vehicle(rcNo) ,
    FOREIGN KEY vehicleNo REFERENCES Vehicle(vehicleNo) ,
    FOREIGN KEY challanId REFERENCES ChallanDetails(challanId) ,
    ownerName VARCHAR(30),
    gender VARCHAR(6),
    mobileNo VARCHAR(10),
    address VARCHAR(50)
    )
