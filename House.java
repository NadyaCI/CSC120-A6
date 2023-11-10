/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // List of all current residents
  private boolean hasDiningRoom; // Boolean saying if the house has a dining room

  /** Constructor */
  public House(String name, String address, int nFloors, boolean diningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String> ();
    this.hasDiningRoom = diningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /** Constructor */
  public House() {
    super("<Name Unknown>", "<Address Unknown>", 1);
  }

  /** Accessor for if house has dining room */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /** Accessor for number of residents */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Adds resident to list of current residents
   * @param name name of resident
   */
  public void moveIn(String name){
    if (this.residents.contains(name) == false) {
      this.residents.add(name);
    }
    else{
      throw new RuntimeException("This person is already a resident of " + this.name);
    }
  }
  
  /** 
   * Removes resident from list of current residents
   * @param name name of resident
   * @return name of resident who moved out
   */
  public String moveOut(String name){
    if (this.residents.contains(name) == true){
      this.residents.remove(name);
      return name;}
    else{
      throw new RuntimeException(name + " is not a resident of " + this.name);
    }
  }

  /**
   * If a person is a resident of the house
   * @param person the person who may live in the house
   * @return if they live in the house
   */
  public boolean isResident(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    new House();
  }
}