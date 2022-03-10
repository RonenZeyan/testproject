public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int bb;
	
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.bb = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return bb;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
