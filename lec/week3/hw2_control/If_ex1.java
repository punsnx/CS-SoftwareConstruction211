import java.util.Scanner;

public class If_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st number: ");
        int num1 = in.nextInt();
        System.out.print("2nd number: ");
        int num2 = in.nextInt();
        System.out.print("3rd number: ");
        int num3 = in.nextInt();

        // your code
        int max = Integer.MIN_VALUE;
        if(num1>max) max=num1;
        if(num2>max) max=num2;
        if(num3>max) max=num3;
        System.out.println("max: "+max);
    }


    
}
