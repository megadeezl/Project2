
/**
 * Write a description of class AnimClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimClock {

    public AnimClock() {

    }

    public AnimClock(float timeStep) {
        this.timeStep = timeStep;
    }
    // instance variables - replace the example below with your own
    private float timeStep,tick;

    public float getTimeStep() {
        return this.timeStep;
    }

    public void setTimeStep(float timeStep) {
        this.timeStep = timeStep;
    }

    public float getTick() {
        return this.tick;
    }

    public void setTick(float tick) {
        this.tick = tick;
    }

    public void Tick() {
        setTick(tick + tick);
       // this.tick = timeStep * tick;
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
