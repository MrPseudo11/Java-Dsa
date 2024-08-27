import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        int number[] = new int[size];       
        for(int i=0; i <= (size-1);i++){
            number [i]= sc.nextInt();
    }
     int x = sc.nextInt();
     
    for(int i = 0; i <= (size-1); i++){
     if( number[i] == x ) {
        System.out.println(" x is found : " + i);
       }  sc.close();
    }
 }
}
