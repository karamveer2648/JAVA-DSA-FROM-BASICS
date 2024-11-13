import javax.print.DocFlavor.STRING;

public class menu {
    
    public static int findcusine(String menu[], String cusine){
        for(int i = 0; i < menu.length; i++){
            if (menu[i] == cusine){
                return i;
            }
        
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String menu[] = {"Chinese", "Punjabi", "South Indian"};
        String cusine = "Punjabi";


        int index = findcusine(menu, cusine);
        if (index == -1){
            System.out.println("Not there");
        }
        else{
            System.out.println("The punjabi cusine is on:"+index);
        }

    }
}
