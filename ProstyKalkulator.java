/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosty.kalkulator;

/**
 *
 * @author krola
 */
public class ProstyKalkulator {

    /**
     * rogram BARDZO prosty kalkulator
     */
    public static void main(String[] args) {
        double a = 12.2, b = 5.4, c;
        char d = '*';
        
        System.out.println("To jest prosty kalkulator");
        System.out.println("Potrafi wykonać tylko podstawowe obliczenia tj. +, -, *, /"
                + "");
        System.out.println(" ");
        
        if (d!='+' && d!='-' && d!='*' && d!='/')
            System.out.println("Podany znak nie jest prostym działaniem d = " + d);
        
// Korzystamy z fuknkcji warunkowej "switch"
        
        switch(d)
            {
        case '+':
                {
                    System.out.println("Operacja dodawania +");
                    c = a + b;
                    System.out.println("Wynik to " + a + " + " + b + " = " + c);
                }
            break;
        case '-':
                {
                    System.out.println("Operacja odejmowania -");
                    c = a - b;
                    System.out.println("Wynik to " + a + " - " + b + " = " + c);
                }
            break;
        case '*':
                {
                    System.out.println("Operacja mnożenia *");
                    c = a * b;
                    System.out.println("Wynik to " + a + " * " + b + " = " + c);
                }
            break;
        case '/':
                {
                    System.out.println("Operacja dzielenia /");
                    c = a / b;
                    System.out.println("Wynik to " + a + " / " + b + " = " + c);
                }
            break;
        }
    }
}
            