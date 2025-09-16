import java.util.Scanner;

public class printDate {
    public static void main(String[] args) {
       printAmerican("Tuesday", 16, "September", 2025);
       printEuropean("Tuesday", 16, "September", 2025);
    }
    
    public static void printAmerican(String day, int date, String month, int year) {
      System.out.println("American format: " + day +", "+ month +" " + date + ", " + year);
    }
    
    public static void printEuropean(String day, int date, String month, int year) {
      System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}