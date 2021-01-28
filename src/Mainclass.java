import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        BottleDispenser bd = new BottleDispenser();
        Scanner input = new Scanner(System.in);
        Integer valinta;
        while(true){
            System.out.print("\n*** BOTTLE DISPENSER ***\n" +
                    "1) Add money to the machine\n" +
                    "2) Buy a bottle\n" +
                    "3) Take money out\n" +
                    "4) List bottles in the dispenser\n" +
                    "0) End\n" +
                    "Your choice: ");
            valinta = input.nextInt();

            switch(valinta){
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.buyBottle();
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.returnList();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
