//Q1.Java Program to Arithmetic Calculator using switch case Statements
import java.util.*;
public class q1{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter operation (+, -, *, /, %): ");
    char ch=sc.next().charAt(0);
    switch(ch){
        case '+':
            System.out.println("Add: "+(a+b));
            break;
        case '-':
            System.out.println("Sub: "+(a-b));
            break;
        case '*':
            System.out.println("Mul: "+(a*b));
            break;
        case '/':
            System.out.println("Div"+(a/b));
            break;
        case '%':
            System.out.println("Mod-Div"+(a%b));
            break;
        default :
            System.out.println("Invalid Operation");                    
    }
    sc.close();
    }
}