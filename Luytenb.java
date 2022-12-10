/**
 * Luytenb - describes a Luytenb object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class Luytenb extends Planet {
    //instance variable
    private String name; 

    /**
     * standard constructor for objects of class Luytenb
     */
    public Luytenb() {}
    
    /**
     * second constructor for a Luytenb object
     * @param String name - name of planet
     * @param int distanceFromEarth - distance from earth
     * @param mass - mass of the planet
     * @param double pastVisitors - how many visitors in the past
     * @param boolean certifiedSafe - if celestial body is safe or not
     */
    public Luytenb( String name, int distanceFromEarth, double mass, int pastVisitors, boolean certifiedSafe ) {
        super( distanceFromEarth, mass, pastVisitors, certifiedSafe );
        this.name = name;
    }
    
    /**
     * overridden 
     * howToSurvive from Habitable interface - tells the user how to survive on this planet
     * @param  none
     * @return String
     */
    @Override
    public String printEquipmentNotice() {
        return "rock slides are inevitable";
    }

    /**
     * overridden 
     * toString from Object class
     * @param  none
     * @return String
     */
    @Override
    public String toString() {
        return this.name + " is a popular destination! Keep in mind " + this.printEquipmentNotice() +
                " so, " + this.howToSurvive() + "Certified Safe Status: " + super.getCertifiedSafe();
    }
}
