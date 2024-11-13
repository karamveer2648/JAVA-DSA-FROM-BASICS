public class maxsubsum {
    public static int maxarraysum(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum=0;
        for(int i = 0;i < number.length;i++){
            int start = i;
            for(int j= i+1; j< number.length; j++){
                int end = j;
                currsum = 0;
                for(int k=start; k < end +1; k++){
                    currsum += number[k];
                    if(currsum > maxsum){
                        maxsum = currsum;
                    }
                }
            }
        }
    return maxsum;
    }
    
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        int maxsum = maxarraysum(number);
        System.out.println(maxsum);
    }
}
