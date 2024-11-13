
public class ar {
    public static void update(int number[]){

        for(int i = 0; i < number.length; i++){
            number[i] = number[i] +1;
        }
    }
    public static void main(String[] args) {


        int number [] = {1,2,3};
        update(number);

        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
