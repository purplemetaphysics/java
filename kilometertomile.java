import java.util.Scanner;

public class kilometertomile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        double km = sc.nextFloat();

        double miles = km / 1.609344;

        System.out.print("Miles = " + miles);
    }
}