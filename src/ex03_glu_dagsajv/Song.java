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

public class Song {
    
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

    private String title;
    private String originalArtist;
    private int yearReleased;
    private double trackLength; // mins

    Song() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getOriginalArtist() {
        return originalArtist;
    }
    
    public int getYearReleased() {
        return yearReleased;
    }
    
    public double getTrackLength() {
        return trackLength;
    }
    
    /**
     * @param updatedTitle The updated title of the song.
     */
    public void setTitle(String updatedTitle) {
        title = updatedTitle;
    }
    
    /**
     * @param updatedOriginalArtist Updated name of the original artist.
     */
    public void setOriginalArtist(String updatedOriginalArtist) {
        originalArtist = updatedOriginalArtist;
    }
    
    /**
     * @param updatedYearReleased Updated year of release.
     */
    public void setYearReleased(int updatedYearReleased) {
        yearReleased = updatedYearReleased;
    }
    
    /**
     * @param updatedTrackLength Updated track length in minutes.
     */
    public void setTrackLength(double updatedTrackLength) {
        trackLength = updatedTrackLength;
    }
    
    public void outputMetadata() {
        System.out.printf("Title: %12s%n"
                + "Original artist: %12s%n"
                + "Year released: %12s%n"
                + "Track length in minutes: %12s%n",
                title, originalArtist, yearReleased, trackLength
        );
        System.out.println("\n");
    }
    
    /**
     * @param setTitle The title of the new song.
     * @param setArtist The original artist of the new song.
     * @param setReleaseYear The release year of the new song.
     * @param setTrackLength The track length, in minutes, of the new song.
     */
    public Song(String setTitle, String setArtist, int setReleaseYear, double setTrackLength) {
       title = setTitle;
       originalArtist = setArtist;
       yearReleased = setReleaseYear;
       trackLength = setTrackLength;
    }
}
