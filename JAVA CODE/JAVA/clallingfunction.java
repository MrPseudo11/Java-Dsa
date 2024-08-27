import java.util.*;
public class clallingfunction {
    public static int multipy(int a,int b){
    int product = a * b;
    return product;
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
   int product = multipy(a , b);
   System.out.println(product);
}
    
}
