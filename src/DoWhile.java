import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int a,b;
        int c;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter 2 numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Sum is "+(a+b));
            System.out.println("DO you want to continue?");
            c=sc.nextInt();
        }while(c==1);


    }
}
