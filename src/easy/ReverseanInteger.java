package easy;

public class ReverseanInteger {
    public static int reverseAnInteger(int num){

        System.out.println("Integer before reverse: " + num);
        int reversed = 0;
        int digit;
        while(num !=0){ //In order to include negative numbers.
            digit = num % 10;
            if ((reversed > Integer.MAX_VALUE / 10 ) || (reversed < Integer.MIN_VALUE / 10)) {
                System.out.println("Overflow detected! Returning 0.");
                return 0;
            }
            reversed = reversed * 10 + digit;
            num = num / 10;
            System.out.println("Stop reversed: " + reversed);
        }
        System.out.println("Reversed number is: " + reversed);
        return reversed;
    }
    public static void main(String args[])
    {
        reverseAnInteger(1234);
        reverseAnInteger(-987);
        reverseAnInteger(1534236469); // 0 --> overflow
    }
}
