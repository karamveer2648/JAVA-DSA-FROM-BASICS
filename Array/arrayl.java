
public class arrayl {
    
    public static int linearsearch(int number[], int key){
        for(int i =0; i < number.length; i++){
            if (number[i]== key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,88,99,77,8,55,2,11,6,11};
        int key = 55;    

        int index= linearsearch(number, key);
        if(index == -1){
            System.out.println("No key exist");
        }
        else{
            System.out.println("Key is at index: "+index);
        }
    }
}
