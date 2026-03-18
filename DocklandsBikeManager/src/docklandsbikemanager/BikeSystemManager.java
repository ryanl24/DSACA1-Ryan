/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
//the main system it controlls all of the data
public class BikeSystemManager implements CRUDOperations {
    //stores all of the objects
    private SinglyLinkedList bikes;
    private SinglyLinkedList stations;
    private StackADT actions;//stack to track recent actions
    private QueueADT maintenance;//queue for maintanane
    
    public BikeSystemManager(){
        bikes = new SinglyLinkedList();
        stations = new SinglyLinkedList();
        actions = new StackADT();
        maintenance = new QueueADT();
    }
    //Bikes metods
    
    //gives access to bike list used for queue functionality
    public SinglyLinkedList getBikesList(){
        return bikes;
    }
    
    //Bikes metods
    //adds bike to the list and records the action
    public void addBike(Bike bike){
        bikes.add(bikes.size()+ 1, bike);
        actions.push("Added bike " + bike.getBikeId());
    }
    //same for remove
    public void removeBike(int index){
        bikes.remove(index);
        actions.push("Remove bike at index "+ index);
        
        
    
    }
    //returns a string of all the bikes to display in GUI
    public String viewBikes(){
        return bikes.displayList();
    }
    
    
    //station methodds
    //records all actions
    public void addStation(BikeStation station){
        stations.add(stations.size() + 1, station);
        actions.push("Added station " + station.getStationId());
    }
    
    public void removeStation(int index){
        stations.remove(index);
        actions.push("Removed station at index " + index);
    }
    
    //returns a string to display
    public String viewStations(){
        return stations.displayList();
    }
    
    
    //Queue ()maintainance
    //adds bike to queue (FIFO)
    public void sendToMaintenance(Bike bike){
        maintenance.enqueue(bike);
        actions.push("Bike sent to maintenance " + bike.getBikeId());
    }
    
    //processes the next bike in queue
    public Object processMaintenance(){
        return maintenance.dequeue();
        
        
    }
    
    public String viewQueue(){
        return maintenance.displayQueue();
    }
    
   
    //stack actions
    
    //displays all recordedd actions(LIFO order)
    public String viewActions(){
        return actions.displayStack();
    }
    
    public Object undoAction(){
        return actions.pop();
    }
    
    @Override
    public void create(Object obj){
        
    }
    
    @Override
    public Object read(String id){
        return null;
    }
    
    @Override
    public void update(String id, Object updateObj){
        
    }
    
    @Override
    public void delete(String id){
        
    }
    
    
}
