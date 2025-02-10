/*Write a function that computes the list of the first 100 fibonacci numbers.
 * The first two Fibonacci numbers are 1 and 1. the n+1-st fibonacci number can
 * be computed by adding the n-th and the n-1-th Fibonacci number.
 * The first few are therefore 1, 1, 1+1=2, 1+2=3, 2+3=5, 3+5=8
 */
public class Question4 {
    public static void fibonacci(int n){
        int a = 1;
        int b = 1;
        int temp = 1;

        for(int i = 0; i < n; i++){
            System.out.println(a);
            temp = b;
            b = a+b;
            a = temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
        
    }
}
