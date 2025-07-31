package Berechnung;
import java.util.Scanner;    // es hat Fehler

import static Berechnung.Ackermann.ackermann;

public class Main {
    public static void main(String[]args){
        Scanner c= new Scanner(System.in);
        int n,m;
        System.out.println("geben bitte sie zwei zahlen ein");
        
        n=c.nextInt();
        m=c.nextInt();
        System.out.println(" Ackermann("+n+","+m+")= "+ ackermann(n,m));
    }
}
