//Q5.Java Program using switch to implement a mini ATM simulation
import java.util.*;
public class q5{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Option (1. Withdraw, 2. Deposit, 3. Check Balance): ");
    int o=sc.nextInt();
    int bal=2000;
    if(o==1 || o==2){
        System.out.println("Enter amount to Withdraw / Deposit");    
        int b=sc.nextInt(); 
    switch(o){
        case 1: 
            if(b<=bal){
                bal=bal-b;
                System.out.println("Take amount \n Balance = "+bal);
                break;
            }
            else{
                System.out.println("your amount exceeds the balance \n Balance = "+bal);
            break;
            }
        case 2: 
            System.out.println("Deposited amount is Success \n Balance = "+(bal+b));
            break;    
        default :
            System.out.println("enter valid amount");                    
    }
}
    else if(o==3){
        System.out.println("Balance = "+bal);
    }
    else{
        System.out.println("Enter valid option");
    }

}
}