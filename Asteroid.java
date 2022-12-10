/**
 * Asteroid - describes a Asteroid object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public abstract class Asteroid extends NonSelfLuminous {
    //instance variable
    private int distanceFromEarth;

    /**
     * constructors
     */
    protected Asteroid() {}

    /**
     * second constructor
     * @ param int, int, boolean
     */
    protected Asteroid( int distanceFromEarth, int pastVisitors, boolean certifiedSafe ) 
    {
        super( certifiedSafe, pastVisitors );
        this.distanceFromEarth = distanceFromEarth;
    }
}
