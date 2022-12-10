/**
 * Eunomia - describes a Eunomia object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class Eunomia extends Asteroid {
    //instance variable
    private String name; 

    /**
     * standard constructor for objects of class Eunomia
     */
    public Eunomia() {
        //implicit call to the superconstructor in Asteroid
    }
    
    /**
     * second constructor for a Eunomia object
     * @param String name - name of planet
     * @param int distanceFromEarth - distance from earth
     * @param double pastVisitors - how many visitors in the past
     * @param boolean certifiedSafe - if celestial body is safe or not
     */
    public Eunomia( String name, int distanceFromEarth, int pastVisitors, boolean certifiedSafe ) {
        super( distanceFromEarth, pastVisitors, certifiedSafe );
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
        return "there is often an impact notice";
    }
    
    /**
     * overridden 
     * howToSurvive 
     * @param  none
     * @return String
     */
    @Override
    public String howToSurvive() {
        return "bring your helmet.";
    }
    
    /**
     * overridden 
     * toString from Object class
     * @param  none
     * @return String
     */
    @Override
    public String toString() {
        return  this.name + " is a fast moving Asteroid. Keep in mind " + this.printEquipmentNotice() +
                " so, " + this.howToSurvive() + "Certified Safe Status: " + super.getCertifiedSafe();
    }
}
