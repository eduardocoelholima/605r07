import java.util.Date;

public class  Array extends Storage	{
	int MAX = 4;
	int   soMany  = 0;
	boolean nullObjectAdded = false;
	final String name = "Array";
        boolean unlimited = false;
        final Date creationTime = new Date();
        Date modificationTime = null;
	Object[] theStorage = new Object[MAX];

  	public Array()	{
		init();
	}
	protected void init()	{
		theStorage = new Object[MAX];
		for ( int index = 0; index < MAX; index ++ )
			theStorage[index] = null;
	}
	protected void setMax(int max)	{
		this.MAX = max;
	}
	protected Object[] getTheStorage()	{
		return theStorage;
	}
	private void setModificationTime()	{
		modificationTime = new Date();
	}
	private int findFreeSpace()	{
		for ( int index = 0; index < MAX; index ++ )	{
			if ( theStorage[index] == null )
				return index;
		}
		return -1;
	}
	public boolean add(Object aObject)	{
		boolean rValue = false;
		if ( aObject == null )	{
			nullObjectAdded = true;
			rValue = true;
		} else {
			if ( ! isFull () )	{
				theStorage[findFreeSpace()] = aObject;
				rValue = true;
				soMany++;
			} else {
				rValue = false;
			}
		}
		if ( rValue )
			setModificationTime();
		return rValue;
	}
	private int findObject(Object aObject)	{
		for ( int index = 0; index < MAX; index ++ )
			if ( ( theStorage[index] != null )       &&
			     ( theStorage[index].equals(aObject) ) )
				return index;
		return -1;
	}
	public boolean delete(Object aObject)	{
		boolean rValue = false;
		if ( aObject == null )	{
			rValue = nullObjectAdded;
			nullObjectAdded = false;
		} else {
			if ( ! isEmpty () )	{
				rValue = false;
				int index = findObject(aObject);
				if ( index >= 0 )	{
					theStorage[index] = null;
					rValue = true;
					soMany --;
				}
			} else
				rValue = false;
		}
		if ( rValue )
			setModificationTime();
		return rValue;
	}
	public int getMax()	{
		return MAX;
	}
	public int size()	{
		return nullObjectAdded ? soMany + 1 : soMany;
	}
	public boolean contains(Object aObject)	{
		boolean rValue = true;
		if ( aObject == null )	{
			rValue = true;
		} else {
			if ( ! isEmpty () )	{
				int index = findObject(aObject);
				if ( index >= 0 )	{
					rValue = true;
				}
			} else
				rValue = false;
		}
		return rValue;
	}
	public boolean isFull()	{
		return soMany == MAX;
	}
	public boolean isEmpty()	{
		return soMany == 0;
	}
	public String getClassName()	{
		return name;
  	}
	public String toString()	{
		String aString = 
			"\n	name: " + getClassName()  +
			"\n	creationTime: " + creationTime  +
                        "\n	unlimited: " + unlimited        +
                        "\n	soMany = " + size()		+
                        "\n	nullObjectAdded = " + nullObjectAdded	+
                        "\n	modificationTime: " +
                                ( modificationTime == null ? "not set" :
                                modificationTime )
                        ;
		String content = "";
		for ( int index = 0; index < MAX; index ++ )	{
			if ( theStorage[index] != null )
				content += theStorage[index] + ", ";	
		}
		return aString + "\n	" + content;
	}

	public static void main(String args[])	{
		Array aArray = new Array();
		aArray.add(null);
		aArray.add("abc");
		System.out.println(aArray);
	}
}


