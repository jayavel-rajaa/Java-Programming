import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class q24{
  public static void main(String[] args) {
    SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    System.out.println(sdf.format(new Date()));    
  }
}