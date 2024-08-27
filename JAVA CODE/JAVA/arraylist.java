import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList l1= new ArrayList<>();
        // to add element in arraylist
        l1.add(2);
        l1.add(1);
        l1.add(5);
        l1.add(4);
        l1.add(8);
        l1.add(9);
        // to print arraylist
        System.out.println(l1);
        //to replace the ith index with other number
        l1.set(1,10);
        //to the elemnt of ith index number of an arraylist  
        System.out.println(l1.get(1));
        // to add an number in arraylist
        l1.add(0,100);
        // to print the size of an arraylist
        System.out.println(l1.size());
        // to remove the element of the ith index
        l1.remove(0);
        // to remove element directly 
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);
        // to check that it contain an given element or not 
        System.out.println(l1.contains(9));// it return a boolean value which is true or false
    }
    
}
