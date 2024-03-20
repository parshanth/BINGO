import java.util.*;

public class Main {
    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    static List<Integer> Comp;

    public static void PrintArray(int arr[][], String str) {
        System.out.println();
        System.out.println(str + "'s Array");
        System.out.println();
        System.out.println("|B | |I | |N | |G | |O | ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] < 10) {
                    System.out.print("| " + arr[i][j] + "| ");
                } else {
                    System.out.print("|" + arr[i][j] + "| ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ComputerArray[][] = new int[5][5];
        Integer[] InitialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 22, 24, 25};
        List<Integer> list = Arrays.asList(InitialArray);
        Collections.shuffle(list);
        Comp = new ArrayList<>(list);

        for (int i = 0, index = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ComputerArray[i][j] = Comp.get(index++);
            }
        }
        int PersonArray[][] = new int[5][5];
       /* System.out.println("Welcome to the BINGO Game");
        System.out.println("Enter Numbers from 1 to 25");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                PersonArray[i][j] = s.nextInt();
            }
        }*/
        PrintArray(ComputerArray, "Computer");
        PrintArray(PersonArray, "Your");

       // int f;
        //System.out.println("Select who is going to start");
        //System.out.println("Computer for 1 and You for 0");
        //f = s.nextInt();
        //if (f == 1) {
            computer(ComputerArray, PersonArray);
        //}
    }

    public static void computer(int ComputerArray[][], int PersonArray[][]) {

        //int Pnumb=PersonNumber();
        int summa=0;
        while(summa!=8){
            int Cnumb=ComputerNumber();
            System.out.println(Cnumb);
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(Cnumb==ComputerArray[i][j]){
                        ComputerArray[i][j]=0;
                    }
                }
            }PrintArray(ComputerArray,"Computer");

            summa++;
        }
    }

    public static int ComputerNumber() {
        Collections.shuffle(Comp);
        int AAEE = Comp.remove(0);
        return AAEE;
    }
    public static int PersonNumber(){
        int NUMB;
        System.out.print("Enter Number:");
        NUMB=s.nextInt();
        return NUMB;
    }
}
