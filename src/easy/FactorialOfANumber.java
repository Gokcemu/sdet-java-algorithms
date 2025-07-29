package easy;

public class FactorialOfANumber {

    public static int factorialOfANumber(int num){
        if(num< 0){
            System.out.println("Negative number! Not valid."); //Negative numbers don't have a factorial value
            return -1;
        }
        if( num == 0){
            System.out.println("The factorial of 0 is always 1.");
            return 1;
        }
        int result=1;  // Factorial of a number algorithm --> n = (n-1)*(n-2)*(n-3) ... (n-n)
        for(int i=0; i<num ; i++){
            result *= (num-i);
        }
        System.out.println("The factorial of a number is: " + result);
        return result;
    }
    public static void main(String args[]){
        factorialOfANumber(5);
        factorialOfANumber(0);
        factorialOfANumber(-3);
    }
}
