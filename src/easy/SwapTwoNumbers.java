package easy;

public class SwapTwoNumbers {
    public static void swapTwoNumbers(int num1, int num2){
        System.out.println("Before swap: num1" + num1 + "Before sawp: num2" + num2);

        num1 = num1 + num2; // num1=5, num2=10 new num1=15 (new num1=15)
        num2 = num1 - num2; // num1=15, num2=10 new num2=5 (new num2=5 which is first num1 value)
        num1 = num1 - num2; // num1=15, num2=5 new num1=10 (new num1=10 which is first num2 value)

        System.out.println("After swap num1" + num1 + "After swap: num2" + num2);
    }

    public static void main(String[] args){
        swapTwoNumbers(5,10);
    }
}
