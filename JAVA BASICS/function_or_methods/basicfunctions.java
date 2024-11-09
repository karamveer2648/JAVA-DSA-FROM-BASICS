import java.util.Scanner;

public class basicfunctions {
   
    public static int multiply() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        return product; 
    }
    public static void main(String[] args) {
        int product = multiply();
        System.out.println(product);
    }
}
