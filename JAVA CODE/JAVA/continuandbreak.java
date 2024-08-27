import java.util.*;
public class continuandbreak {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n = sc.nextInt();
       System.out.println("Enter the value of x");
       int x = sc.nextInt();
       for(int i=1; i<=n; i++){
        if(i==x){
            System.out.println();
        }else{
            System.out.println(i);
        }
       } 
    sc.close();
    }
}

