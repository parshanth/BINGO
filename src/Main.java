import java.util.*;

public class Main {
    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    static List<String> Comp;

    public static void PrintArray(String arr[][], String str) {
        System.out.println();
        System.out.println(str + "'s Array");
        System.out.println();
        System.out.println("|B | |I | |N | |G | |O | ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j].length() < 3) {
                    System.out.print("| " + arr[i][j] + "| ");
                } else {
                    System.out.print("|" + arr[i][j] + "| ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String ComputerArray[][] = new String[5][5];
        String[] InitialArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "22", "24", "25"};
        List<String> list = Arrays.asList(InitialArray);
        Collections.shuffle(list);
        Comp = new ArrayList<>(list);

        for (int i = 0, index = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ComputerArray[i][j] = Comp.get(index++);
            }
        }
        String PersonArray[][] = new String[5][5];
        System.out.println("Welcome to the BINGO Game");
        System.out.println("Enter Numbers from 1 to 25");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                PersonArray[i][j] = s.next();
            }
        }
        PrintArray(ComputerArray, "Computer");
        PrintArray(PersonArray, "Your");

        int f;
        System.out.println("Select who is going to start");
        System.out.println("Computer for 1 and You for 0");
        f = s.nextInt();
        if (f == 1) {
            computer(ComputerArray, PersonArray);
        }
    }

    public static void computer(String ComputerArray[][], String PersonArray[][]) {
        int summa = 0;
        while (summa != 25) {
            String Cnumb = ComputerNumber();
            ConvertArray(Cnumb, ComputerArray);
            ConvertArray(Cnumb, PersonArray);
            System.out.println("COMPUTER TOLD:" + Cnumb);
            PrintArray(ComputerArray, "COMPUTER");
            PrintArray(PersonArray, "Your");
            summa++;
        }
    }

    public static String ComputerNumber() {
        Collections.shuffle(Comp);
        String AAEE = Comp.remove(0);
        return AAEE;
    }

    public static void ConvertArray(String a, String[][] arr) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a.equals(arr[i][j])) {
                    arr[i][j] = "X";
                }
            }
        }
    }
}
