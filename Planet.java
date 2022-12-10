/**
 * Planet - describes a planet object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public abstract class Planet extends NonSelfLuminous {
    //instance variables
    private int distanceFromEarth;
    private double mass;

    /**
     * constructors
     */
    protected Planet() {
        //implicit call to super()
    }
    protected Planet( int distanceFromEarth, double mass, int pastVisitors, boolean certifiedSafe ) {
        super( certifiedSafe, pastVisitors );
        this.distanceFromEarth = distanceFromEarth;
        this.mass = mass;
    }
    
    /**
     * getMass - getter for the mass instance variable
     * @param  none
     * @return double
     */
    public double getMass() {
        return this.mass;
    }

    
    /**
     * overridden 
     * howToSurvive from Habitable interface - tells the user how to survive on a planet
     * @param  none
     * @return String
     */
    @Override
    public String howToSurvive() {
        return " rent specialized equipment in advance.";
    }
}
