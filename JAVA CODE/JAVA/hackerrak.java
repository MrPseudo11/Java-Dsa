import java.io.*;
public class hackerrak {
    


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    
    if(n%3==0 || n%5==0){
        System.out.println(n/3);
    System.out.println(n/5);
        System.out.println("FizzBuzz");
    }
    if(n%3==0){
        System.out.println(n/3);
        System.out.println("Fizz");
    }
     if(n%5==0){
        System.out.println(n/5);
        System.out.println("Buzz");
    }
      if(n%3==0 &n%5==0){
        System.out.println(n);
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}

}
