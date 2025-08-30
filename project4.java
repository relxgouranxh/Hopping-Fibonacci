import java.util.Scanner;
public class project4 {
    public static void fibo(int n){
        int i=1;
        int t1=0;
        int t2=1;
        int maxnumb=20;
        while(i<=n){
            int next=t1+t2;
            if(next>maxnumb){
                System.out.print("Month "+ i + ":" +" "+next+"   ");
                for(int j=0;j<maxnumb;j++){
                    System.out.print(" 🐇");
                }
                System.out.print("..."+" total"+"("+next+")");
            }
            else{
                System.out.print("Month "+ i + ":" +" "+next+"   ");
                for(int j=0;j<next;j++){
                System.out.print(" 🐇");
            }
            }
            System.out.println();
            t1=t2;
            t2=next;
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many months of growth do you want to simulate? ");
        int months=sc.nextInt();
        fibo(months);
    }
}
