
public class rv {
    public static void main(String[] args) {
        
        int n = 10899, k = 5;

        
        for (int i = 1; i <= k; i++){
             int lastdigit = n % 10;
             n = n / 10;
             System.out.print(lastdigit);
        }
    }
}
