/* This is a stub for the Cafe class */
public class Cafe extends Building{

    /** Constructor */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 128;
        this.nSugarPackets = 10;
        this.nCreams = 10;
        this.nCups = 10;
        System.out.println("You have built a cafe: ☕");
    }

    /** Constructor */
    public Cafe() {
        super("<Name Unknown>", "<Address Unknown>", 1);
        this.nCoffeeOunces = 128;
        this.nSugarPackets = 10;
        this.nCreams = 10;
        this.nCups = 10;
        System.out.println("You have built a cafe: ☕");
      }

    /** 
     * Reduces amount of items in inventory 
     * @param size amount of coffee
     * @param nSugarPackets # of sugar packets
     * @param nCreams # of splashes of cream 
     * */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if ((this.nCoffeeOunces<size) || (this.nSugarPackets<nSugarPackets) 
            ||  (this.nCreams<nCreams) || (this.nCups<1)){
            this.restock(128, 10, 10, 10);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -=nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    /**
     * Restocks inventory
     * @param nCoffeeOunces amount of coffee in oz
     * @param nSugarPackets # of sugar packets
     * @param nCreams # of splashes of cream
     * @param nCups # of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    public static void main(String[] args) {
        new Cafe();
    }  
}
