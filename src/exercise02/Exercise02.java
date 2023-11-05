/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

/**
 *
 * @author jaydendagsa
 */
public class Exercise02 {
    
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stage cryptoDotComArena = new Stage(); // use defaults
        System.out.println("Stage 1\n" + cryptoDotComArena.name + "\nCapacity: " + cryptoDotComArena.capacity + "\nArea: " + cryptoDotComArena.area + "\n");
        
        Stage philippineArena = new Stage();
        
        // define ph arena
        philippineArena.name = "Philippine Arena";
        philippineArena.capacity = 55000;
        philippineArena.area = 36715;
        
        System.out.println("Stage 2\n" + philippineArena.name + "\nCapacity: " + philippineArena.capacity + "\nArea: " + philippineArena.area + "\n");
        
        Stage sgNatlStadium = new Stage();
        
        // define SG Nat'l Stadium
        sgNatlStadium.name = "Singapore National Stadium";
        sgNatlStadium.capacity = 55000;
        sgNatlStadium.area = 75000;
        
        System.out.println("Stage 3\n" + sgNatlStadium.name + "\nCapacity: " + sgNatlStadium.capacity + "\nCapacity: " + sgNatlStadium.area + "\n");
        
        Song song1 = new Song(); // use defaults
        
        System.out.println("Song 1\n'" + song1.title + "' by " + song1.originalArtist + "\nReleased " + song1.yearReleased + ", " + song1.trackLength + " minutes long\n");
        
        Song song2 = new Song();
        
        // define song2
        song2.title = "Everybody Wants to Rule the World";
        song2.originalArtist = "Tears for Fears";
        song2.yearReleased = 1985;
        song2.trackLength = 4.35;
        
        System.out.println("Song 2\n'" + song2.title + "' by " + song2.originalArtist + "\nReleased " + song2.yearReleased + ", " + song2.trackLength + " minutes long\n");
        
        Singer singer = new Singer(); // use defaults
        
        System.out.println("Singer:\n" + singer.name + "\n");
        
        
        singer.favoriteSong = song1;
        System.out.println("Favorite song of " + singer.name + ": '" + singer.favoriteSong.title + " by " + singer.favoriteSong.originalArtist + "\n");
        
        // perform for audience of 12 people
        singer.performForAudience(12, cryptoDotComArena);
        
        // change fave song to song 2
        singer.changeFavSong(song2);
        
    }
    
}
