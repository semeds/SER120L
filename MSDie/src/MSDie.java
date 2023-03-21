import java.security.SecureRandom;

public class MSDie
{
    private int sides;
    private int value;
    
    public MSDie(int sides)
    {
        // YOUR CODE BELOW
    	SecureRandom faceValue = new SecureRandom();
    	value = faceValue.nextInt(sides) + 1; 
    }

	public void roll()
    {
        // YOUR CODE BELOW
		SecureRandom rollValue = new SecureRandom();
		value = rollValue.nextInt(sides) + 1;
    }
    
    // PROVIDE PROPER SETTER & GETTER AS NEEDED
    public int getSides(){
		return sides;
	}
    
    public int getValue(){
    	return value;
    }
    
}