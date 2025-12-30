import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        boolean asc = true;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)>num.charAt(i+1)){
                asc = false;
                break;
            }
        }
            if(asc == true)
                System.out.println("ascending");
            else
                System.out.println("not Ascending");

        
    }
}