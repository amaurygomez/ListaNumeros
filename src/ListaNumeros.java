
import java.io.Console;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amaury
 */

public class ListaNumeros {
    
    private static void method(){
            System.out.println("Introduzca 4 numeros ");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
       Scanner ec = new Scanner(System.in);
     int b = ec.nextInt();
       Scanner wc = new Scanner(System.in);
     int c = wc.nextInt();
       Scanner qc = new Scanner(System.in);
     int d = qc.nextInt();
     
     if(a > b && a > c && a > d){
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
     
     } if(b > a && b > c && b > d){
     System.out.println(b);
     System.out.println(a);
     System.out.println(c);
     System.out.println(d);
     
     }
      if(c > a && c > b && c > d){
     System.out.println(c);
     System.out.println(d);
     System.out.println(b);
     System.out.println(a);
     
     
      }
       if(d > a && d > b && d > c){
     System.out.println(d);
     System.out.println(c);
     System.out.println(b);
     System.out.println(a);
     
     }
    }
    
     
     public static void main(String[]argumentos){
      method();
     
     }
             
}
