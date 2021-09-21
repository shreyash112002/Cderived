
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            int n;
            float a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 numbers");
            a=sc.nextFloat();
            b=sc.nextFloat();

            System.out.println("1-Add,2-Minus,3-Division,4-Multiplication");
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Addition is "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction is"+(a-b));
                    break;
                case 3:
                    System.out.println("Division is"+(a/b));
                    break;
                case 4:
                    System.out.println("Multiplication is"+(a*b));
                    break;
            }
        }
    }


