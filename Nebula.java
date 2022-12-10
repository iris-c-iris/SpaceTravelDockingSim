/**
 * Nebula - defines a Nebula type inheriting from selfLuminous and Habitable
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class Nebula extends selfLuminous implements Habitable {
    //instance variable
    private boolean byob;

    /**
     * standard constructor for objects of class Nebula
     */
    public Nebula(){
        //implicitry invokes super()
    }
    /**
     * second constructor for the Nebula class
     * @param  boolean byob
     */
    public Nebula( boolean byob ) {
        //exlicit call to superconstructor to complete constructor chain
        super( "Cosmic Taylor Swift" ); 
        this.byob = byob;
    }

    /**
     * overridden 
     * howToSurvive from Habitable interface - tells the user how to survive on this nebula
     * @param  none
     * @return String
     */
    @Override
    public String howToSurvive() {
        return "Don't use TicketMaster. Bring oxygen.";
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
