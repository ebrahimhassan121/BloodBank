/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ahmed
 */
public class Donors {
    
     private String bloodtype;
     private String bloodstatus;
     private int number_of_bags;
     private String description;
     private int ssn;
     private int hospital_id;

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getBloodstatus() {
        return bloodstatus;
    }

    public void setBloodstatus(String bloodstatus) {
        this.bloodstatus = bloodstatus;
    }

    public int getNumber_of_bags() {
        return number_of_bags;
    }

    public void setNumber_of_bags(int number_of_bags) {
        this.number_of_bags = number_of_bags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }
    
}
