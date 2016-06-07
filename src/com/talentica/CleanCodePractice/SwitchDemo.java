package com.talentica.CleanCodePractice;

public class SwitchDemo {
private double a;
private double b;
private double r;
public final int SQUARE = 0;
public final int RECTANGLE = 1;
public final int CIRCLE = 2;
 

public double calculateArea(int shape) { 
     double area = 0;
     switch(shape) {    
	
	case SQUARE:
             area = a * a;
             break;
         case RECTANGLE:
             area = a * b;
             break;
         case CIRCLE:
             area = Math.PI * r * r;
             break;
     }
     return area;
 }

public double calculatePerimeter(int shape) {
     double perimeter = 0;
     switch(shape) {
         case SQUARE :
             perimeter = 4 * a;
             break;
         case RECTANGLE:
             perimeter = 2 * (a + b);
             break;
         case CIRCLE:
             perimeter = 2 * Math.PI * r;
             break;
     }
     return perimeter;
 }
 
}
 
	 