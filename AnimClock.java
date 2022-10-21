
/**
 * Write a description of class AnimClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimClock {

    //float timeStep will be used for setting timeStep
    //float totalTime will be used to track totalTime
    private float timeStep;
    private float totalTime;
    //long tick will be used to track tick setting 
    private long tick;

    //Default Constructor AnimClock will instantiate default settings
    public AnimClock() {
        this.timeStep = 1/60; // requirement must be at least 1/60 
        this.tick = 0;
        this.totalTime = 0;
    }

    // Parameric Constructor AnimClock will set timeStep instance variable
    public AnimClock(float timeStep) {
        this.timeStep = timeStep;
        this.tick = 0;
        this.totalTime = 0;
    }

    // Getters and Setters of Encapsulated Class Variables 
    public float getTimeStep() {
        return this.timeStep;
    }

    public void setTimeStep(float timeStep) {
        this.timeStep = timeStep;
    }

    public float getTick() {
        return this.tick;
    }

    public void setTick(long tick) {
        this.tick = tick;
    }

    public float getTotalTime() {
        return this.totalTime;
    }

    public void setTotalTime(float totalTime) {
        this.totalTime = totalTime ;
    }

    public void Tick() {
        float currenttime = getTotalTime();
        setTotalTime(currenttime + 1);
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
        return getTotalTime() * getTimeStep() ;
    }
}
