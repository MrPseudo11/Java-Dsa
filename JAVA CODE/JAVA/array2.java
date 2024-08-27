import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the entry of the array");
        int n=sc.nextInt();
        int om []=new int[n];
        for(int i=0;i<n;i++){
            om[i]=sc.nextInt();
        }
        
        for(int i=(n-1);i>=0;i--){
        // for(int j=0;j<n;j++){
        //     om[j]=om[i];
        //  1 2 3 4
        //  0 1 2 3
        
            System.out.println(om[i]);
           
        }
        sc.close();   }
        }
    

    
    

