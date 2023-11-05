/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_glu_dagsajv;

/**
 *
 * @author jaydendagsa
 */

// EX03_GLU_DagsaJV

public class Stage {
    
    // Written by Jayden Dagsa, 2023.
    // Licensed under the terms of the MIT License.
    
    /*
    Copyright 2023, Jayden Riley V. Dagsa
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the “Software”), to deal 
    in the Software without restriction, including without limitation the rights 
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
    copies of the Software, and to permit persons to whom the Software is furnished 
    to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all 
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
    INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
    PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
    CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
    OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
    */
    
    private String name;
    private String owner;
    private int capacity;
    private double area;
    
    public String getName() {
        return name;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setName(String updatedName) {
        name = updatedName;
    }
    
    public void setOwner(String updatedOwner) {
        owner = updatedOwner;
    }
    
    public void setCapacity(int updatedCapacity) {
        capacity = updatedCapacity;
    }
    
    public void setArea(double updatedArea) {
        area = updatedArea;
    }
    
    public void outputInfo() {
        System.out.printf("Name: %12s%n"
                + "Owner: %12s%n"
                + "Capacity: %12s%n"
                + "Area in square meters: %12s%n",
                name, owner, capacity, area
        );
        System.out.println("\n");
    }
    
    /**
     * @param newName The name of the new stage.
     * @param newOwner The owner of the new stage.
     * @param newCapacity The capacity of the new stage.
     * @param newArea The area, in square meters, of the new stage.
     */
    public Stage(String newName, String newOwner, int newCapacity, double newArea) {
        name = newName;
        owner = newOwner;
        capacity = newCapacity;
        area = newArea;
    }
}
