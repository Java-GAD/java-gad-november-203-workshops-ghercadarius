import java.util.Scanner;

public class Main {
    public static void printHallowPattern(int nrRows, int nrColumns){
        for(int i = 1; i <= nrColumns; i++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i < nrRows - 1; i++){
            System.out.print("*");
            for(int j = 1; j < nrColumns - 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i <= nrColumns; i++) {
            System.out.print("*");
        }
    }

    public static void printLeftHalfTriangle(int nrRows){
        for(int i = 1; i <= nrRows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrRows = sc.nextInt(), nrColumns = sc.nextInt();
        printHallowPattern(nrRows, nrColumns);
        System.out.print("\n");
        printLeftHalfTriangle(nrRows);
    }
}