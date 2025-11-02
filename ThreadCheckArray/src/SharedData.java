import java.util.ArrayList;

/** jyfhg
 * The following class holds and shares data between 
 * components or threads
 */
public class SharedData 
{
	/**
	 * @param array stores a list of integers
	 * @param winArray stores a boolean list of results
	 * @param flag for decisions (use or don't use a certain value)
	 * @param b constant integer to sum results
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**  hihbjnlnkn
	 * @param array		Holds list of integer variables
	 * @param b			Integer that holds the sum of 2 numbers
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/** jhvbjh
	 * @return			getter that sends an array of boolean values
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**  ojo
	 * @param winArray		setter that updates the boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** oiuhhuoo
	 * @return		getter that sends an array of integer values
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** hjhi
	 * @return		the final integer b
	 */
	public int getB() 
	{
		return b;
	}

	/** ojoon
	 * @return		the boolean value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**  iuiuhhuo
	 * @param flag		setter for the boolean parameter flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
