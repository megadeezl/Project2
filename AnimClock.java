
/**
 * Write a description of class AnimClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimClock
{
    // instance variables - replace the example below with your own
    private float timeStep,tick;

    /**
     * Constructor for objects of class AnimClock
     */
    public float Tick(float step,float tick)
    {
        // initialise instance variables
        float ans=timeStep*tick;
        return ans;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float GetTime()
    {
        // put your code here
        return timeStep*tick;
    }
}
