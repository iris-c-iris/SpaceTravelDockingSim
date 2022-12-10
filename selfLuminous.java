/**
 * selfLuminous - describes a generic selfLuminous object - abstract class
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public class selfLuminous {
    //instance variable
    private String artist;

    /**
     * standard constructor - for completeness
     */
    protected selfLuminous() {}
    /**
     * second constructor
     * @ param String artist
     */
    protected selfLuminous( String artist ) {
        this.artist = artist; 
    }

    /**
     * getArtist - getter for the artist instance variable
     * @param  none
     * @return String
     */
    public String getArtist() {
        return this.artist;
    }
}
