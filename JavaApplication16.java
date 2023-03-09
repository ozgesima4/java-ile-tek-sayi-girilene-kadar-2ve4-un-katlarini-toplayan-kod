
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int sayi,toplam=0;
       do{
         System.out.println("sayi:");
        sayi=input.nextInt();
        if(sayi%2==0&&sayi%4==0){
            toplam+=sayi;
            System.out.println("şuana kadar girdiginiz sayilardan 2ve4e bolunen sayilarin top:"+toplam);
        }
       }while(sayi%2==0);  //doğru oldukça do scopu hep çalışacak.
        
        
       
        
    }
    
}
