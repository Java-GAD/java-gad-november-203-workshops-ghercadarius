import java.util.Scanner;

public class Main {
    public static void printHallowPattern(int nr_rows, int nr_columns){
        for(int i = 1; i <= nr_columns; i++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i < nr_rows - 1; i++){
            System.out.print("*");
            for(int j = 1; j < nr_columns - 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i <= nr_columns; i++) {
            System.out.print("*");
        }
    }

    public static void printLeftHalfTriangle(int nr_rows){
        for(int i = 1; i <= nr_rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr_rows = sc.nextInt(), nr_columns = sc.nextInt();
        printHallowPattern(nr_rows, nr_columns);
        System.out.print("\n");
        printLeftHalfTriangle(nr_rows);
    }
}