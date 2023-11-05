/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

/**
 *
 * @author jaydendagsa
 */
public class Exercise01 {

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
        // define SS4
	Subject socSci = new Subject();
	socSci.name = "Social Science 4";
	socSci.weeklyPeriods = 3;
	socSci.totalTimeWeekly = 2.25;
        
        // define Math4
	Subject math = new Subject();
	math.name = "Mathematics 4";
	math.weeklyPeriods = 4;
	math.totalTimeWeekly = 3;
        
        // define CS4
	Subject comSci = new Subject();
	comSci.name = "Computer Science 4";
	comSci.weeklyPeriods = 3;
	comSci.totalTimeWeekly = 2.25;
                
        // output objects
        // socSci
	System.out.println("Subject 1");
	System.out.println("Name: " + socSci.name);
	System.out.println("Number of periods in a week: " + socSci.weeklyPeriods);
	System.out.println("Total subject time per week in hours: " + socSci.totalTimeWeekly + "\n");
        // math
	System.out.println("Subject 2");
        System.out.println("Name: " + math.name);
        System.out.println("Number of periods in a week: " + math.weeklyPeriods);
        System.out.println("Total subject time per week in hours: " + math.totalTimeWeekly + "\n");
        // computerScience
	System.out.println("Subject 3");
        System.out.println("Name: " + comSci.name);
        System.out.println("Number of periods in a week: " + comSci.weeklyPeriods);
        System.out.println("Total subject time per week in hours: " + comSci.totalTimeWeekly + "\n");
        // total no. of periods
	int sumOfPeriods = socSci.weeklyPeriods + math.weeklyPeriods + comSci.weeklyPeriods;
        System.out.println("Total number of periods: " + sumOfPeriods);
        // does math have more periods than socsci?
	boolean mathMorePeriodsThanSocSci = math.weeklyPeriods > socSci.weeklyPeriods;
        System.out.println("Math 4 has more periods than Social Science 4: " + mathMorePeriodsThanSocSci);
        // do socSci and comsci have their first meeting of the week on same day?
        boolean socSciComSciWeeklyTimeComparison = (socSci.totalTimeWeekly == comSci.totalTimeWeekly);
        System.out.println("CS4 and SS4 have same amount of meeting time per week: " + socSciComSciWeeklyTimeComparison);
    }
    
}

class Subject {
	String name = "Sample Subject 26";
	int weeklyPeriods = 0;
	double totalTimeWeekly = 1.5; // in hours
}
