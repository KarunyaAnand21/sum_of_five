
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int fnum =sc.nextInt();
        System.out.println("enter second number");
        int snum =sc.nextInt();
        System.out.println("enter thrid number");
        int tnum =sc.nextInt();
        System.out.println("enter fourth number");
        int fonum =sc.nextInt();
        System.out.println("enter fifth number");
        int finum =sc.nextInt();
        int total=(fnum+snum+tnum+fonum+finum);
        System.out.println("total " + total);

    }
}