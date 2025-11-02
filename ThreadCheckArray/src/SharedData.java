import java.util.ArrayList;

/**
 * The following class holds and shares data between 
 * components or threads
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array		Holds list of integer variables
	 * @param b			Integer that holds the sum of 2 numbers
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return			getter that sends an array of boolean values
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray		setter that updates the boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return		getter that sends an array of integer values
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return		the final integer b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return		the boolean value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag		setter for the boolean parameter flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
