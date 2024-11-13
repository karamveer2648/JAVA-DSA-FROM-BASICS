
public class revarray {
    
    public static void rev(int number[]){
        int first = 0; int last = number.length-1;

        while(first < last){
            int temp = number[last];
            number[first] = number[last];
            number[first] = temp;


            first ++;
            last --;
        }
    }
    public static void print(int number[]){
        for(int i = 0; i < number.length; i++){
            System.out.print(", "+number[i]);

        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int number[] = {1,2,3,4,5,6,7,8,9};
        rev(number);
        print(number);
     }
}
