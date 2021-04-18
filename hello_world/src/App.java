import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // println moves the cursor to next line
        System.out.println("Hello, World!");

        // Scanner object
        Scanner sc=new Scanner(System.in);  

        // print just outputs the string and does not moves cursor to next line
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();  
        System.out.print("Enter second number- ");  
        int b= sc.nextInt();  
        System.out.print("Enter third number- ");  
        int c= sc.nextInt();  
        int d=a+b+c;  

        // String contcatenation using + is alllowed
        System.out.println("Total= " +d);  

        // Calling this function just for fun
        main2(args);

        // Closing the scanner object
        sc.close();
    }
    public static void main2(String[] args) throws Exception {
        System.out.println("He2llo, World!");
    }
}