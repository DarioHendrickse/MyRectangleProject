/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myrectangleproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class MyRectangleProject {

    //decalring the global variables
    private static double length;
    private static double width;
    private static double areaResult;
    private static double perResult;
    private static Rectangle rectangle = new Rectangle();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GetUserInput(); //calling method to ask use for rectangle inputs
    }
    
    //creating method to ask user for rectangle inputs
    public static void GetUserInput()
    {
        String l = JOptionPane.showInputDialog(null, "What is the length?");
        length = Double.parseDouble(l); //converting String to double
        
        String w = JOptionPane.showInputDialog(null, "What is the width?");
        width = Double.parseDouble(w); //converting String to double
        
        CreateRectangleInstance(); //calling the creation method for Rectangle
    }
    
    //method to create the Rectangle object with the given length and width
    public static void CreateRectangleInstance()
    {
        rectangle = new Rectangle(length, width);//using Master constructor
        
        GetCalculations(); //proceed to calculation method
    }
    
    //method to calculate area and perimeter
    public static void GetCalculations()
    {
        
        rectangle.getArea(length, width);//calculating area
        areaResult = rectangle.getArea();//setting global variable
        
        rectangle.getPerimeter(length, width);//calulating perimter
        perResult = rectangle.getPerimeter();//setting global value
        
        DisplayMessage(); //proceed to display method
    }
    
    //method to output results as a message to console
    public static void DisplayMessage()
    {
        
        String green = "\u001B[32m"; //green colour
        String blue = "\u001B[34m"; //blue colour
        
        //outputting messages to console
        System.out.println(green + "The area of the rectangle is " 
                + areaResult);
        
        System.out.println(blue + "The perimeter of the rectangle is " 
                + perResult);
        
        Restart(); //proceed to method to ask user if they want to run again
    }
    
    //method to offer the user the option to restart the program
    public static void Restart()
    {
        // creating new Scanner class
        Scanner kb = new Scanner(System.in);
        
        // asking user if they wish to restart the program
        System.out.println("Would you like to make another calculation? (Y/N)");
        String ans = kb.nextLine();
        
        // using if statement to compare user input with provided conditions
        if (ans.equals("Y") || ans.equals("y"))
        {
            GetUserInput(); // calling method to ask for new user inputs
        }
        
        else
        {
            System.exit(0); // ending the program
        }
        
    }
}
