/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
//child class for bike 
public class ElectricBike extends Bike{
    
    private int batteryLevel;
    public ElectricBike( String bikeId, String modelType, String status,int batteryLevel) {
        super(bikeId, modelType, status);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    
    
    //adds battery info for the electic bikes
    @Override
    public String displayDetails(){
        return "Electric Bike -- " +super.displayDetails()+ ", Battery Level: " + batteryLevel + "%";
    }
    
}
