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
public class Timeclose {
    private int id;
    private int hospital_id;
    private int donar_id;
    private String bloodtrpe;
    private String  date;
    private String time;
    private int flag;

    public int getFlag() {
        return flag;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public int getDonar_id() {
        return donar_id;
    }

    public void setDonar_id(int donar_id) {
        this.donar_id = donar_id;
    }

    public String getBloodtrpe() {
        return bloodtrpe;
    }

    public void setBloodtrpe(String bloodtrpe) {
        this.bloodtrpe = bloodtrpe;
    }

    public String getDate() {
        return  date;
    }

    public void setDate(String Dtae) {
        this. date = Dtae;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    
    
    
}
