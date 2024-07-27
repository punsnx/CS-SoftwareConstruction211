import java.util.Scanner;

public class If_ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantity: ");
        int num = in.nextInt();
        // your code 
        double totalPrice = num * 100;
        double d = 1;
        if(totalPrice >= 1000)d=0.9;
        totalPrice *= d;
        System.out.println(String.format("Total price: %d",(int)totalPrice));


    }
}
