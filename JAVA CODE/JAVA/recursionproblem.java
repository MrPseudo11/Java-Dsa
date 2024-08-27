import java.util.*;

public class recursionproblem{
  public static int least( int arr [],int i,int n){
    if(i==n-1){
      return 0;
    }
   
    int op1 = least( arr, i+1, n) + Math.abs(arr[i]-arr[i+1]);
    if(i==n-2){
       return op1;
    }
    int op2 =least(arr,i+2,n) + Math.abs(arr[i]-arr[i+2]);
    return Math.min(op1, op2);
  }

  public static void main(String[] args) {
    int arr []={10,30,40,20};
System.out.println(least(arr, 0, arr.length));
  }
    }
    
  

   
