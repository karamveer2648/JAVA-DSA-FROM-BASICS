import java.util.Scanner;

public class parameters {
    
    public static int sumofnumbers(int a , int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumofnumbers(a, b);
        System.out.println("Sum of Numbers is:" + sum);
    }
}
