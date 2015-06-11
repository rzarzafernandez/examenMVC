/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 *
 * @author rzarzafernandez
 */
public class Presentacion {
    private Scanner sc = new Scanner(System.in);
    
    public Modelo chooseArea(Modelo object) {
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        object.shapeType = sc.nextLine();
        System.out.println("You said: " + object.shapeType);
        return object;
    }
    
    public Modelo dataSquare(Modelo object) {
        System.out.println("what is the side length?");
        object.side1 = sc.nextFloat();
        return object;
    }
    
    public Modelo dataRectangle(Modelo object) {
        System.out.println("what is the rectangles width?");
        object.side1 = sc.nextFloat();
        System.out.println("What is the rectangles height?");
        object.side2 = sc.nextFloat();
        return object;
    }
    
    public Modelo dataTriangle(Modelo object) {
        System.out.println("What is the base length of the triangle?");
        object.side1 = sc.nextFloat();
        System.out.println("What is the height of the triangle?");
        object.side2 = sc.nextFloat();
        return object;
    }
    
    public Modelo dataCircle(Modelo object) {
        System.out.println("What is the radius of the circle?");
        object.side1 = sc.nextFloat();
        return object;
    }
    public void printArea(Modelo object) {
        System.out.println("The area for your " + object.shapeType + " : " + object.area);
    }
    
}
