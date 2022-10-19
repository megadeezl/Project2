import java.util.Random;

/**
 * Write a description of class RandomInteger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomInteger
{
    private int min;
    private int max;
    private int range; 
    
    public RandomInteger()
    {
        min=0;
        max=100;
        range=max-min+1;
        
        
    }
    public RandomInteger(int min, int max){
        this.min=min;
        this.max=max;
        this.range=max-min+1;
    }
    public int getMin(int min){
        this.min = min;
        this.range=max-min+1;
        return min;
    }
    public int getMax(int max)
    {
        this.max=max;
        this.range=max-min+1;
        return max;
    }
    public int GiveRandom()
    {
        int random;
        Random generator = new Random();
        random = generator.nextInt(max);
        return random;
    }
    
}
