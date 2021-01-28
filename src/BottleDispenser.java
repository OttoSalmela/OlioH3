public class BottleDispenser {
    private int bottles;
    // The array for the Bottle-objects
    private Bottle[] bottle_array;
    private int money;

    public BottleDispenser() {
        bottles = 5;
        money = 0;

        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0;i<bottles;i++) {
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle();
        }

    }

    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }

    public void buyBottle() {
        if (money < bottle_array[1].getPrize()){
            System.out.println("Add money first!");
        }else if (bottles == 0){
            System.out.println("Out of bottles!");
        }
        else{
            bottles -= 1;
            money -= 1;
            System.out.println("KACHUNK! " + bottle_array[1].getName() + " came out of the dispenser!");
        }
    }

    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}