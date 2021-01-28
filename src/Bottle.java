public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;

    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        price = 1.8;
    }
    public Bottle(String iname, String manuf, double totE, double isize, double prize){
        name = iname;
        manufacturer = manuf;
        total_energy = totE;
        size = isize;
        price = prize;

    }
    public String getName(){return name;}
    public String getManufacturer(){return manufacturer;}
    public double getEnergy(){return  total_energy;}
    public double getSize(){return size;}
    public double getPrice(){return price;}
}
