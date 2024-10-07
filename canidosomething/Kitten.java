
/**
 * Write a description of class Kitten here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kitten extends Cat {
    public int Months = 0;
    Kitten(String nAME, int aGE, int mONTHS) {
      super(nAME, aGE);
      
    }
    
    /**
     * how nyansical is that cat
     *
     * @return    the cattiness value
     */
    public float howCatty() {
        // put your code here
        return Cattiness;
    }
    
    public float moreCatty(float add) {
      Cattiness += add;
      return Cattiness;
    }
    
    public void sayToCat(String sayWhat) {
      switch(sayWhat.toLowerCase()){
      case "meow":
        System.out.println("Mew");
        break;
      default:
        System.out.println("Mw?");
      }
    }
    
    public void sayToConsoleCat() {
      switch(new java.util.Scanner(System.in).nextLine().toLowerCase()){
      case "meow":
        System.out.println("Mew");
        break;
      default:
        System.out.println("Mw?");
      }
    }
}
