import java.util.Scanner;
import java.util.Random;

public class Main {

    public static char [][] map;
    public static final int size = 3;
    public static final int dtw = 3;
    public static final char d_e = '•';
    public static final char d_x = 'X';
    public static final char d_o = 'O';
    public static int mark_one, mark_two;
    public static int x, y;



    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = d_e;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public static Scanner sc = new Scanner(System.in);

    public static void humanTurn() {
        do {
            System.out.println("Enter coordinates in row-column format : ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = d_x;
        printMap();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[x][y] == d_e) return true;
        return false;
    }

    public static Random rand = new Random();

    public static void aiTurn() {
        System.out.println("AI turn...");
        //начало последнего задания
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        map[x][y] = d_o;
        printMap();
    }

    public static boolean checkVictory(char symbol, int dtw) {
        //начало второго задания
        mark_one = 0;
        mark_two = 0;
        for(int i = 0; i < size; i++){
            if (map[i][i] == symbol) mark_one++;
            if (map[i][size-i-1] == symbol) mark_two++;
            if (mark_one == dtw || mark_two == dtw) return true;
        }

        for (int i = 0; i < size; i++) {
            mark_one = 0;
            mark_two = 0;
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symbol) mark_one++;
                if (map[j][i] == symbol) mark_two++;
            }
            if (mark_one == dtw || mark_two == dtw) return true;
        }
        return false;
    } //конец второго задания

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == d_e) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("GAME START");
        initMap();
        printMap();
        while(true){
            humanTurn();
            if (checkVictory(d_x, dtw)) {
                System.out.println("Human is victorious!");
                System.out.println("---------");
                break;
            }

            if (isMapFull()) {
                System.out.println("Draw");
                System.out.println("---------");
                break;
            }

            aiTurn();
            if (checkVictory(d_o, dtw)) {
                System.out.println("AI is victorious!");
                System.out.println("---------");
                break;
            }

            if (isMapFull()) {
                System.out.println("Draw");
                System.out.println("---------");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}