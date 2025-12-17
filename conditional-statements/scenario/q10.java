//Q10.Write a Java program to print "Stop / Ready / Go" based on traffic light color.
import java.util.*;
public class q10 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    switch(s){
        case "RED": case "red":
            System.out.print("Stop");
            break;
        case "ORANGE": case "orange":
            System.out.print("Ready");
            break;
        case "GREEN": case "green":
            System.out.print("Go");
            break;
        default:
            System.out.print("Enter valid color");

        }

   sc.close();
}
}