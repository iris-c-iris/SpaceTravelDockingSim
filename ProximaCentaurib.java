/**
 * ProximaCentaurib - describes a ProximaCentaurib object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class ProximaCentaurib extends Planet {
    //instance variables
    private String name; 

    /**
     * standard constructor for objects of class ProximaCentaurib
     */
    public ProximaCentaurib() {}
    
    /**
     * second constructor for a ProximaCentaurib object
     * @param String name - name of planet
     * @param int distanceFromEarth - distance from earth
     * @param mass - mass of the planet
     * @param double pastVisitors - how many visitors in the past
     * @param boolean certifiedSafe - if celestial body is safe or not
     */
    public ProximaCentaurib( String name, int distanceFromEarth, double mass, int pastVisitors, boolean certifiedSafe ) {
        super( distanceFromEarth, mass, pastVisitors, certifiedSafe );
        this.name = name;
    }

    /**
     * overridden 
     * printEquipmentNotice from Habitable interface  
     * @param  none
     * @return String
     */
    @Override
    public String printEquipmentNotice() {
        return "high solar radiation is possible." ;
    }
    
    /**
     * overridden 
     * howToSurvive from Habitable interface - tells the user how to survive on this planet
     * @param  none
     * @return String
     */
    @Override
    public String howToSurvive() {
        return "keep your Geiger counter close";
    }
    
    /**
     * overridden 
     * toString from Object class
     * @param  none
     * @return String
     */
    @Override
    public String toString() {
        return super.getPastVisitors() + " have visited " + this.name + " and with a mass of "+ super.getMass() + 
               " it has plenty of room for more. Make sure to " + this.howToSurvive() + " because " + this.printEquipmentNotice();
    }
}
