import java.util.Scanner;

public class Itemprizegst {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Prize of Pencil");
        float pencil = sc.nextFloat();
        System.out.print("Enter the Prize of Pen");
        float pen = sc.nextFloat();
        System.out.print("Enter the Prize of Eraser");
        float eraser = sc.nextFloat();
        
        float total = pencil + pen + eraser;
        System.out.println("Total Prize of Items is: "+total+"Rs (without GST)");
        float gst = total * 0.18f;

        System.out.println("GST is: "+gst+"Rs");
        System.out.println("Total Prize of Items is: "+(total+gst)+"Rs (with GST)");
    }       
}
