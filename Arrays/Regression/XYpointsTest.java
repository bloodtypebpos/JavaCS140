


public class XYpointsTest
{
	String name = "";
	int count = 0;
	
	static XYpoints[] theData = new XYpoints[1];
	
	public XYpointsTest(String theName)
	{
		name = theName;
	}
	
	public void addData(XYpoints newData)
	{
		XYpoints[] tempData = new XYpoints[count + 1];
		if (theData.length !=0)
		{
			for (int i = 0; i < theData.length; i++)
			{
				tempData[i] = theData[i];
			}
		}
		tempData[count] = newData;
		count = count + 1;
		theData = tempData;
	}


	
//////////////////////Accessors //////////////////////////////////	
	
	public XYpoints[] getXYpoints()
	{
		return theData;
	}
	
	
	public static XYpoints getXYgroup(String theGroup)
	{
		  for(int i = 0; i < theData.length ; i++)
		  {
			  if( theData[i].getGroup()==theGroup )
			  {
				  return theData[i];
			  }
		  }
		  	  System.out.println("No employees have that title");
		  	  return null; // Since java requires something to return here
		  	               // this is apparently the way to return nothing
	 }
	
	public static XYpoints getXYID(int theID)
	{
		  for(int i = 0; i < theData.length ; i++)
		  {
			  if( theData[i].getID()==theID )
			  {
				  return theData[i];
			  }
		  }
		  	  System.out.println("No groups have that ID");
		  	  return null; // Since java requires something to return here
		  	               // this is apparently the way to return nothing
	 }	
	
	
	public static XYpoints ShowXYIDs()
	{
		  for(int i = 0; i < theData.length ; i++)
		  {

			  System.out.println("[" + theData[i].getID() + "]    " + theData[i].getGroup());
		  }
		  	  return null; // Since java requires something to return here
		  	               // this is apparently the way to return nothing
	 }	
	
}
