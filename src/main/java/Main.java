package BankAccountPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	//BankAccount
        BankAccount bobAccount = new BankAccount(1000, -1000, "Bob");
        BankAccount lisaAccount = new BankAccount(1000, -1000, "Lisa");

        System.out.println("Initial Balances:");
        System.out.println(bobAccount);
        System.out.println(lisaAccount);

        boolean successTransfer = bobAccount.transfer(500, lisaAccount);
        System.out.println("\nTransfer of 500 from Bob to Lisa: " + (successTransfer ? "Successful" : "Failed"));
        System.out.println(bobAccount);
        System.out.println(lisaAccount);

        successTransfer = bobAccount.transfer(1600, lisaAccount);
        System.out.println("\nTransfer of 1600 from Bob to Lisa: " + (successTransfer ? "Successful" : "Failed"));
        System.out.println(bobAccount);
        System.out.println(lisaAccount);
        
        
        //Rectangle
        
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        
        Rectangle rect = new Rectangle(length, width);
        
        rect.draw();
        
        System.out.println("Area: " + rect.calcArea());
        System.out.println("Perimeter: " + rect.calcPerimeter());
        System.out.print("Enter the scale factor: ");
        int scaleFactor = scanner.nextInt();
        
        rect.scale(scaleFactor);
        System.out.println("Scaled Rectangle: " + rect);
        
        rect.draw();
        
        //Circle
        
        Circle firstCircle = new Circle(5.0);
        Circle secondCircle = new Circle(8.0);
        
       firstCircle.draw();
       System.out.println("The first circle area is: " + firstCircle.area());
       
       secondCircle.draw();
       System.out.println("The second circle area is: " + secondCircle.area());
       
       
        
       
        
        
        
        
    }
}
