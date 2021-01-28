import java.util.ArrayList;
import java.util.Scanner;

public class BottleDispenser {
    private double money;
    private ArrayList<Bottle> list = new ArrayList<Bottle>();

    public BottleDispenser() {
        money = 0;

        list.add(new Bottle());
        list.add(new Bottle("Pepsi Max","Pepsi",0.3,1.5,2.2));
        list.add(new Bottle("Coca-Cola Zero","Coca-Cola",0.3,0.5,2.0));
        list.add(new Bottle("Coca-Cola Zero","Coca-Cola",0.3,1.5,2.5));
        list.add(new Bottle("Fanta Zero","Coca-Cola",0.3,0.5,1.95));
    }

    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }

    public void buyBottle() {
        int pvalinta;
        Scanner input = new Scanner(System.in);
        returnList();
        System.out.print("Your choice: ");
        pvalinta = input.nextInt()-1;
        if (list.isEmpty()) {
            System.out.println("Out of bottles!");
        }else if (money < list.get(pvalinta).getPrice()){
            System.out.println("Add money first!");
        }
        else{
            money -= list.get(pvalinta).getPrice();
            System.out.println("KACHUNK! " + list.get(pvalinta).getName() + " came out of the dispenser!");
            list.remove(pvalinta);
        }
    }

    public void returnMoney() {
        System.out.printf("Klink klink. Money came out! You got %.2f€ back\n", money);
        money = 0;
    }

    public void returnList() {
        for(int i = 0 ; i < list.size() ; i++)
            System.out.println((i+1) + ". Name: " + list.get(i).getName() + "\n\tSize: " + list.get(i).getSize() + "\tPrice: " +list.get(i).getPrice());
    }
}