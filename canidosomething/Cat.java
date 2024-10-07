
/**
 * what kinda stupid layout is this its so professional yech
 * and also whats with all the excessive spacing of the {s
 * why does it need its own line
 * and whats with the empty line 1 the heck is this
 *
 * @Louie Wang
 * @nya1
 */
public class Cat {
    // instance variables - replace the example below with your own
    String Name;
    int Age;
    float Cattiness;

    /**
     * make a cat
     */
    public Cat(String nAME, int aGE) {
        // initialise instance variables
        Name = nAME;
        Age = aGE;
        if(nAME=="Kitta"||nAME=="kitta"){
          Cattiness = 9001;
        } else {
          Cattiness = new java.util.Random().nextFloat()*100;
        }
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
        System.out.println("Mraow");
        break;
      default:
        System.out.println("Meow?");
      }
    }
    
    public void sayToConsoleCat() {
      switch(new java.util.Scanner(System.in).nextLine().toLowerCase()){
      case "meow":
        System.out.println("Mraow");
        break;
      default:
        System.out.println("Meow?");
      }
    }
}