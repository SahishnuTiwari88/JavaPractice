package com.basics;

public class InchesToFeet {
	private int feet;
    private int inches;
    
    public InchesToFeet(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
    	this.inches = inches;
    }
   
    public int getFeet() {
        // TODO: Return the value of feet.
        if(inches<0){
        return -1;
        }
        feet = inches/12;
        inches = inches-(feet*12);
        return feet;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
        if(inches<0){
        return -1;
        }
//        return inches-(result*12);
        return inches%12;
    }    

}
