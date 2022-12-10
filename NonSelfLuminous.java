/**
 * NonSelfLuminous - describes a generic NonSelfLuminous object - abstract class
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public abstract class NonSelfLuminous implements Habitable {
    //instance variables
    private boolean certifiedSafe;
    private int pastVisitors;
    
    /**
     * constructors - the class is abstract
     */
    protected NonSelfLuminous() {}
    protected NonSelfLuminous( boolean certifiedSafe, int pastVisitors ) { 
        this.pastVisitors = pastVisitors;
        this.certifiedSafe = certifiedSafe; 
    }

    /**
     * getCertifiedSafe - getter for the certifiedSafe instance variable
     * @param  none
     * @return boolean
     */
    public boolean getCertifiedSafe() {
        return this.certifiedSafe;
    }
    
    /**
     * getPastVisitors - getter for the servings pastVisitors variable
     * @param  none
     * @return double
     */
    public int getPastVisitors() {
        return this.pastVisitors;
    }
    
    /**
     * printEquipmentNotice - abstract prototype
     * @param  none
     * @return String
     */
    public abstract String printEquipmentNotice();
}
