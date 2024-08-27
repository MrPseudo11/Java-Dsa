import java.util.*;
public class bu {
    public static void sort(int a []){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=0;j<n-1-i;j++){
                if(a[min]>a[j+1]){
                    min = j+1;
                    int temp = a[min];
                    a[min]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }  
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] ={6,4,3,9,7};
        
        sort(a);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    
}
