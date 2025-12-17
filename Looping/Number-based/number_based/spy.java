package looping.number_based;
/*
// Spy number => ( sum of dig == product of dig )
public class Spy{
    public static void main(String [] args){
        int s=0,p=1;
        for(int i=100;i<=1000;i++){
            int t=i;
            while(t!=0){
                int r=t%10;
                s=s+r;
                p=p*r;
                t=t/10;
            }
            int ss=s;
            int pp=p;
            if(ss==pp){
                System.out.println("Spy no.s are "+t);
        }
            }
        }
    } */
public class spy{
    public static void main(String [] args){
        int a=100,b=1000,s=0,p=1,temp=0;
        for(int i=a;i<=1000;i++){
            while(i!=0){
                int r=i%10;
                s=s+r;
                p=p*r;
                i=i/10;
            }
            if(s==p){
                temp=s;
                System.out.println("Spy no.s are "+temp);
        }
        }
    }
}
