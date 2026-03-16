/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public interface CRUDOperations {
    
    public void create(Object obj);
    Object read(String id);
    public void update(String id, Object updateObj);
    public void delete(String id);
    
}
