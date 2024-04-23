// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1
// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
// "Indexing is start from 1"
// Example :
// Input: 6
// Output: 8
public class MyClass {
    public static int fibonacci(int num){
        if(num == 1){
            return 1;
        }
        int n = 1;
        int prev = 1;
        for(int i=2; i<num;i++){
            int temp = n;
            n += prev;
            prev = temp;
        }
        return n;
    }
    
    public static void main(String args[]) {
            System.out.println(fibonacci(5));
    }
}
