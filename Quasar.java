/**
 * Quasar - defines a Quasar type inheriting from selfLuminous and Habitable
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class Quasar extends selfLuminous implements Habitable {
    //instance variable 
    private boolean byob;

    /**
     * standard constructor for objects of class Quasar
     */
    public Quasar(){
        //implicitry invokes super()
    }
    /**
     * second constructor for the Quasar class
     * @param  boolean byob
     */
    public Quasar( boolean byob ) {
        //explicit call to superconstructor to complete constructor chain
        super( "Galactic Cardi B" );
        this.byob = byob;
    }

    /**
     * overridden 
     * howToSurvive from Habitable interface - tells the user how to survive on this planet
     * @param  none
     * @return String
     */
    @Override
    public String howToSurvive() {
        return "Drink electrolytes, bring oxygen, learn to dance.";
    }
    
    /**
     * overridden 
     * toString from Object class
     * @param  none
     * @return String
     */
    @Override
    public String toString() {
        System.out.printf("%s is performing. BYOB status: %b%nMake the most of your visit: %s%n",  super.getArtist(), this.byob, this.howToSurvive());
        return "Thank you";
    }
}
