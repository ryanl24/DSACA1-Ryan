/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class BikeSystemManager implements CRUDOperations {
    
    private SinglyLinkedList bikes;
    private SinglyLinkedList stations;
    private StackADT actions;
    private QueueADT maintenance;
    
    public BikeSystemManager(){
        bikes = new SinglyLinkedList();
        stations = new SinglyLinkedList();
        actions = new StackADT();
        maintenance = new QueueADT();
    }
    
    public SinglyLinkedList getBikesList(){
        return bikes;
    }
    
    //Bikes metods
    
    public void addBike(Bike bike){
        bikes.add(bikes.size()+ 1, bike);
        actions.push("Added bike " + bike.getBikeId());
    }
    
    public void removeBike(int index){
        bikes.remove(index);
        actions.push("remove bike at index "+ index);
        
        
    
    }
    
    public String viewBikes(){
        return bikes.displayList();
    }
    
    
    //station methodds
    
    public void addStation(BikeStation station){
        stations.add(stations.size() + 1, station);
        actions.push("Added station " + station.getStationId());
    }
    
    public void removeStation(int index){
        stations.remove(index);
        actions.push("Removed station at index " + index);
    }
    
    
    public String viewStations(){
        return stations.displayList();
    }
    
    
    //Queue ()maintainance
    
    public void sendToMaintenance(Bike bike){
        maintenance.enqueue(bike);
        actions.push("Bike sent to maintenance " + bike.getBikeId());
    }
    
    public Object processMaintenance(){
        return maintenance.dequeue();
        
        
    }
    
    public String viewQueue(){
        return maintenance.displayQueue();
    }
    
   
    //stack actions
    
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
