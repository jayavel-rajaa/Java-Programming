//Q19.Write a Java program to display mobile data usage alert 
// - "Low Data", "Half consumed", or "Data Over" based on usage.
import java.util.*;
public class q19 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=1024.0f;
        if(a>400f && a<500f)
            System.out.println("Half consumed");
        else if(a>10f && a<100)
            System.out.println("Low data");
        else if(a<=1)
            System.out.println("Data over");
        else
            System.out.println("having data");
    
    sc.close();
}
}