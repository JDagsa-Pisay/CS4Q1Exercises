/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author jaydendagsa
 */
public class Singer {
    
    // Written by Jayden Dagsa, 2023.
    // Licensed under the terms of the MIT License, as referenced below.
    
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

    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int audienceSize, Stage stage) {
        noOfPerformances++;
        earnings += audienceSize * 100;
        
        System.out.println(name + " performed for an audience of " + audienceSize + " people at " + stage.name + ".");
        System.out.println("Earnings: " + earnings + "\n");
    }
    
    public void changeFavSong(Song newFave) {
        favoriteSong = newFave;
        
        System.out.println(name + " has a new favorite song: '" + newFave.title + "' by " + newFave.originalArtist);
    }
    
    public Singer() {
        name = "Juan Whistle dela Cruz";
        noOfPerformances = 0;
        earnings = 0;
    }
}
