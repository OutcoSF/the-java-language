package com.company.object_oriented_programming;

public class Car {

    // State
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Behaviors
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if( validModel.equals("carrera") || validModel.equals("holden")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}


