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

    // fields
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    // getters
    public String getName() {
        return name;
    }
    
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    // setters / adders
    public void addNoOfPerformances(int noOfNewPerfs) {
        noOfPerformances += noOfNewPerfs;
    }
    
    public void addEarnings(int newEarnings) {
        earnings += newEarnings;
    }
    
    public void changeFavSong(Song newFave) {
        favoriteSong = newFave;
        
        System.out.println(name + " has a new favorite song: '" + newFave.getTitle() + "' by " + newFave.getOriginalArtist() + "\n");
    }
    
    // other methods
    public void outputBioInfo() {
        System.out.printf("Name: %12s%n"
                + "Favorite song: %12s%n"
                + "Number of performances: %12s%n"
                + "Total earnings from performances: %12s%n",
                name, favoriteSong.getTitle(), noOfPerformances, earnings
        );
        System.out.println("\n");
    }
    
    public void performForAudience(int audienceSize, Stage stage) {
        totalPerformances++;
        noOfPerformances++;
        earnings += audienceSize * 100;
        
        System.out.println(name + " performed for an audience of " + audienceSize + " people at " + stage.getName() + ".");
        System.out.println("Total no. of performances by singers: " + totalPerformances);
        System.out.println("Earnings of performance: " + (audienceSize * 100) + "\n");
        System.out.println("Total earnings of " + name + ": " + earnings + "\n");
    }
    
    public void performCollabForAudience(Singer singer, int audienceSize, Stage stage) {
        totalPerformances++;
        noOfPerformances++;
        singer.addNoOfPerformances(1);
        
        int earningsPerSinger = (audienceSize * 100) / 2;
        earnings += earningsPerSinger;
        singer.addEarnings(earningsPerSinger);
        
        System.out.println(name + " and " + singer.getName() + " performed for an audience of " + audienceSize + " people at " + stage.getName() + ".");
        System.out.println("Total no. of performances by singers: " + totalPerformances);
        System.out.println("Total earnings of performance: " + earningsPerSinger * 2 + "\nEarnings per singer: " + earningsPerSinger + "\n");
        
        System.out.println("Total earnings of " + name + ": " + earnings);
        System.out.println("Total earnings of " + singer.getName() + ": " + singer.getEarnings() + "\n");
    }
    
    // constructor
    
    /**
     * @param newName The name of the new singer.
     * @param newFaveSong The favorite song of the new singer.
     */
    public Singer(String newName, Song newFaveSong) {
        name = newName;
        favoriteSong = newFaveSong;
        noOfPerformances = 0;
        earnings = 0;
    }
}
