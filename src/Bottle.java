public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double prize;

    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        prize = 1.8;
    }
    public Bottle(String name, String manuf, float totE, float size, float prize){

    }
    public String getName(){return name;}
    public String getManufacturer(){return manufacturer;}
    public double getEnergy(){return  total_energy;}
    public double getSize(){return size;}
    public double getPrize(){return prize;}
}
