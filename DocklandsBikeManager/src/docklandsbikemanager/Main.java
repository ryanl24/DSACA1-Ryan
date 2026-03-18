/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //used for testing
        
        BikeSystemManager manager = new BikeSystemManager();
        
        //Create station
        BikeStation station1 = new BikeStation("S1 ", "Docklands Centre ", "Mayor Street ", 15);
        BikeStation station2 = new BikeStation("S2 ", "Grand Canel Dock ", "Grand Canel ", 20);
        
        //Add station
        manager.addStation(station1);
        manager.addStation(station2);
        
        //Create Bike
        Bike bike1 = new StandardBike("B1", "Standard Model", "Available");
        Bike bike2 = new ElectricBike("B2", "Electric Model", "Available ",78);
        Bike bike3 = new StandardBike("B3", "Standard Model", "Available");
        
        //add bikes
        manager.addBike(bike1);
        manager.addBike(bike2);
        manager.addBike(bike3);
        
        //display station
        System.out.println("stations");
        System.out.println(manager.viewStations());
        
        //display bikes
        System.out.println("bikes");
        System.out.println(manager.viewBikes());
        
        //sending a bike to maintaince
        manager.sendToMaintenance(bike2);
        
        //display queue
        System.out.println("maintenance queue");
        System.out.println(manager.viewQueue());
        
        //process maintenance
        System.out.println("process the next bike");
        System.out.println(manager.processMaintenance());
        
        //display recent actions
        System.out.println("recent actions");
        System.out.println(manager.viewActions());
        
        //remove last action
        System.out.println("undo last action");
        System.out.println(manager.undoAction());
        
        //display again after removing
        System.out.println(" recent actions");
        System.out.println(manager.viewActions());
        
    }
    
}
