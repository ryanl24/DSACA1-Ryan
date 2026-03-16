/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class Bike implements Displayable{
    
    protected String bikeId;
    protected String modelType;
    protected String status;

    public Bike(String bikeId, String modelType, String status) {
        this.bikeId = bikeId;
        this.modelType = modelType;
        this.status = status;
    }

    public String getBikeId() {
        return bikeId;
    }

    public String getModelType() {
        return modelType;
    }

    public String getStatus() {
        return status;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String displayDetails(){
        return "Bike ID: " +bikeId+ ",Model: " +modelType+ ", Status: " + status;
    }
    
    @Override
    public String toString(){
        return displayDetails();
    }
    
}
