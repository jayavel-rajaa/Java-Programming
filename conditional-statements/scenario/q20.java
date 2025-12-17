//Q20.Write a Java program to check if vehicle speed exceeds 100 km/h.
// ("Over-speeding! Fine imposed.","Speed iswithin limit")
import java.util.*;
public class q20{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a>100f)
            System.out.println("Over-speeding! Fine imposed.");
        else
            System.out.println("Speed iswithin limit");
    }
}