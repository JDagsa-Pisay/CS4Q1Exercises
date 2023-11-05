/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_glu_dagsajv;

/**
 *
 * @author jaydendagsa
 */
public class EX03_GLU_DagsaJV {

    // EX03_GLU_DagsaJV
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stage cryptoDotComArena = new Stage("Crypto.com Arena", "Crypto.com", 20000, 88257.9); // use defaults
        cryptoDotComArena.outputInfo();
        
        Stage philippineArena = new Stage("Philippine Arena", "Iglesia ni Cristo", 55000, 36715);
        philippineArena.outputInfo();
        
        Stage sgNatlStadium = new Stage("Singapore National Stadium", "Sport Singapore", 55000, 75000);
        sgNatlStadium.outputInfo();
                
        Song song1 = new Song("Raining in Manila", "Lola Amour", 2023, 4.85);
        song1.outputMetadata();
        
        Song song2 = new Song("Everybody Wants to Rule the World", "Tears for Fears", 1985, 4.35);
        song2.outputMetadata();
        
        Singer juanWhistle = new Singer("Juan Whistle dela Cruz", song1); // use defaults
        juanWhistle.outputBioInfo();
        
        // perform for audience of 12 people
        juanWhistle.performForAudience(12, cryptoDotComArena);
        
        // change fave song to song 2
        juanWhistle.changeFavSong(song2);
        
        Singer michaelKnowlesCarter = new Singer("Michael Knowles-Carter", song2);
        michaelKnowlesCarter.outputBioInfo();
        
        michaelKnowlesCarter.performCollabForAudience(juanWhistle, 2500, sgNatlStadium);
    }
    
}
