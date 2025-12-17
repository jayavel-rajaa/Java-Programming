// voting count (using while / do while)
import java.util.Scanner;
public class vote_count{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int count1=0,count2=0,count3=0,count4=0;
            System.out.println("Party 1: vote : 1");
            System.out.println("Party 2: vote :2");
            System.out.println("Party 3: vote :3");
            System.out.println("Party 4: vote :4");
            System.out.println("end vote : press -1");    
            System.out.println("Enter your vote to : ");
            int a=sc.nextInt();
            while(a!=-1){
            if(a==1){
                count1++;
            }
            else if(a==2){
                count2++;
            }
            else if(a==3){
                count3++;
            }
            else if(a==4){
                count4++;
            }
            else {
                System.out.println("Enter valid vote ");
            }
            System.out.println("Enter your vote to : ");
            a=sc.nextInt();
                
            }
    
        
        System.out.println("Total vote count for all parties is: \n");
        System.out.println(" party 1: "+count1);
        System.out.println(" party 2: "+count2);
        System.out.println(" party 3: "+count3);
        System.out.println(" party 4: "+count4);        
        
    }
}