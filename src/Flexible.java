import java.util.Date;

public class  Flexible extends Array	{
	private final String name = "Flexible";

  	public Flexible()	{
		unlimited = true;
	}
	private void copyAndIncrease() {
		MAX += 2;
		Object[] tmpStorage = new Object[getMax()];
		Object[] storageSoFar = getTheStorage();
		for ( int index = 0; index < storageSoFar.length; index ++ )	{
			tmpStorage[index] = storageSoFar[index];
		}
		setMax(getMax() * 2 );
		init();
		for ( int index = 0; index < storageSoFar.length; index ++ )	{
			super.add(storageSoFar[index]);
		}
	
	}
	public boolean add(Object aObject)	{
		if ( isFull() )
			copyAndIncrease();
		return super.add(aObject);
	}
	public String getClassName()    {
                return name;
        }
	public String toString()	{
		return super.toString();
	}

	public void test()	{
		int theSize = getMax();
		System.out.println(this);
		String aString = "a";
		for ( int index = 0; index < theSize; index ++ ) {
			add(aString);
			aString += "a";
		}
		System.out.println(this);
		aString = "b";
		for ( int index = 0; index < theSize; index ++ ) {
			add(aString);
			aString += "b";
		}
		System.out.println(this);
	}
	public static void main(String args[])	{
		Flexible aFlexible = new Flexible();
		aFlexible.test();
	}
}


