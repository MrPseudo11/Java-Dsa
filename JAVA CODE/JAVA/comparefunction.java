import java.util.*;
public class comparefunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word =sc.nextLine();
        System.out.println("enter the letter ");
        String letter =sc.nextLine();
if(word.compareTo (letter) ==0){
System.out.println("equal");
}else{
    System.out.println("unequal");
}
  sc.close();  }
    
}
