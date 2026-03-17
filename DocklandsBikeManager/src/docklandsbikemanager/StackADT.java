/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

import java.util.ArrayList;


/**
 *
 * @author ryanl
 */
public class StackADT implements StackInterface{
    
    private ArrayList<Object> theStack;

    public StackADT(ArrayList<Object> theStack) {
        this.theStack = theStack;
    }
    
    @Override
    public int size(){
        return theStack.size();
    }
    
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    @Override
    public Object pop(){
        if(!theStack.isEmpty()){
            return theStack.remove(0);
        }else{
            return null;
        }
    }
    
    @Override
    public void push(Object e){
        theStack.add(0,e);
    }
    
    @Override
    public Object peek(){
        if(!theStack.isEmpty()){
            return theStack.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public String displayStack(){
        
        StringBuilder strB = new StringBuilder();
        if(theStack.isEmpty()){
            strB.append("Empty stack");
        }else{
            for(int i = 0; i< theStack.size(); i++){
                strB.append(theStack.get(i).toString());
                strB.append("\n");
            }
        }
        
        return strB.toString();
    }
    
    
    
    
    
    
}
