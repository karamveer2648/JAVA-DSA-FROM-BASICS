import java.util.Scanner;

public class sub {

    public static void subarray(int number[]){
        for(int i = 0; i < number.length; i++){
            int start = i;
            for(int j = i+1; j < number.length; j++){
                int end = j;
                for (int k = start; k < end + 1; k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int number[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }
        subarray(number); 
    }
}
