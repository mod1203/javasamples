/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejsca.zerowa.funkcji.kwadratowej;

/**
 *
 * @author Artur
 */
public class MiejscaZerowaFunkcjiKwadratowej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Program oblicza miejsca zerowe funkcji kwadratowej i sprawdza co to za funkcja
        (liniowa czy kwadratowa) na podstawie instrukcji warunkowej if
        Funkcja kwadratowa o postaci y= a^2 + bx + c
    */
        int a=0, b=10, c=3;
        int delta;
        double x, x1, x2;
        double y;
        
        System.out.println("Dane wejściowe to: a=" + a + " b="+ b + " c=" + c);
        
        if (c == 0)
            // dla c = 0 -> ax^2 + bx
        System.out.println("Funkcja kwadratowa w postaci y=" + a + "x^2 + " + b + "x");
                  
        else if (a == 0 && b != 0)
        {
            System.out.println("");
            System.out.println("To funkcja liniowa o postaci y = bx + c. Funkcja "
                    + "posiada miejsca zerowe z przecięcia z osią x i y");
            System.out.println("");
            // dla x = 0 -> y = c
            y = c;
            System.out.println("Miejsce zerowe y= " + c);
            // dla y = 0 -> x = -(c / b)
            x = ((double)c / (double)b)*(-1);
            System.out.println("Miejsce zerowe x= " + x);
        }
            else if (a != 0 && b != 0)
        {
                System.out.println("");
                System.out.println("To jest funkcja kwadratowa");
                System.out.println("");
                System.out.println("Funkcja o postaci y= " + a + "x^2 + " + b + "x + " + c);
                // Liczymy deltę -> delta = b^2 - 4*a*c
                delta = b*b-4*a*c;
                System.out.println("Delta wynosi = " + delta);
                /* Miejsca zerowe ze wzorów 
                x1 = (-b - sqr (delta) / 2*a)
                x2 = (-b + sqr (delta) / 2*a)
                */
                x1 = (-b - Math.sqrt(delta) / 2*(double)a);
                x2 = (-b + Math.sqrt(delta) / 2*(double)a);
                System.out.println("Miejsca zerowe dla funkcji kwadratowej");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
        }   
                   else if (a == 0 && b == 0 && c != 0)    
                        
                        System.out.println("To nie nie jest funkcja y=" + c);
    
    
    }
    
}
