/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class StandardBike extends Bike{

    public StandardBike(String bikeId, String modelType, String status) {
        super(bikeId, modelType, status);
    }
    
    @Override
    public String displayDetails(){
        return "Standard Bike - " + super.displayDetails();
    }
    
}
