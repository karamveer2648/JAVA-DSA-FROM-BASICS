
public class pair {
    public static void pairs(int number[]){
        int tp = 0;
        for(int i = 0 ; i < number.length ; i++){
            int curr = number[i];            
            for(int j = i+1 ; j < number.length; j++){
                System.out.print("(" + curr+ "," + number[j] + ")");
                tp++;
            }
        }
        System.out.println("Total Numbers of Pair is :"+tp);
    }
    public static void main(String[] args) {
        int number[]= {1,5,6,8,9,5};
        pairs(number);
    }
}
