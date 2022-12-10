/**
 * Planet - describes a planet object
 *
 * @author  Iris Carrigg
 * @version 12/4/2022
 */
public interface Habitable {
    /**
     * howToSurvive - abstract prototype, to be overridden by classes inplementing the 
     *            interface.
     * @param  none
     * @return String
     */
    public abstract String howToSurvive();
}
