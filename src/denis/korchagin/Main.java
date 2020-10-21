package denis.korchagin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int weight = readWeight();
        printFigure(weight);
    }

    public static int readWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight ");
        return scanner.nextInt();
    }

    static void printDash(int weight) {
        for (int j = weight; j > 0; j--) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    static void printSpace(int weight, int i) {
        for (int j = weight - i; j > 0; j--) {
            System.out.print(" ");
        }
    }

    static void printExclamationMark(int i) {
        for (int j = i; j > 0; j--) {
            System.out.print("!");
        }
    }

    static void printFigure(int weight) {
        for (int i = weight; i >= - 1; i--) {
            printDash(weight);
            if ((weight - i) % 2 == 0) {
                printSpace(weight, i);
            }
            printExclamationMark(i);
            System.out.println();
        }
    }
}
