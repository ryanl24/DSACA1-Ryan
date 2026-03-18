/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
// for bike station
public class BikeStation implements Displayable {
    
    private String stationId;
    private String stationName;
    private String location;
    private int capacity;

    public BikeStation(String stationId, String stationName, String location, int capacity) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.location = location;
        this.capacity = capacity;
    }

    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //displays all the info for each stations details
    
    @Override
    public String displayDetails(){
        return "Station ID : " +stationId+ ", Name :" +stationName+ ", Location : " +location+ ",Capacity : "+capacity;
    }
    
    @Override
    public String toString(){
        return displayDetails();
    }
    
}
