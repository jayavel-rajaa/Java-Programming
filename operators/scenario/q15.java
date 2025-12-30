/*An ATM dispenses money in ₹2000, ₹500, and ₹100 notes.
 For a given amount, calculate 
the number of each note required
 (highest denomination first).*/
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int notes2000 = amount / 2000;
        amount = amount % 2000;
        int notes500 = amount / 500;
        amount = amount % 500;
        int notes100 = amount / 100;
        System.out.println("₹2000 notes: " + notes2000);
        System.out.println("₹500 notes: " + notes500);
        System.out.println("₹100 notes: " + notes100);
    }
}
