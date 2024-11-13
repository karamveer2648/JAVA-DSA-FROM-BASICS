
public class largest {
    public static int getlarge(int numbers[])
    
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
            if ( smallest > numbers[i] ){
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest value is "+smallest);
        return largest;
    }
     public static void main(String[] args) {
     int numbers[] = {1,8,9,54,7,4};
     int large = getlarge(numbers);
     System.out.println("The largest number in given arry is "+large);
    }
}
