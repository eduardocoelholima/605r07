import java.util.Date;

public class  Storage	{
  	final String name = "Storage";

  	public Storage()	{
	}
	public String getClassName()	{
		return name;
  	}
	public String toString()	{
		return name;

	}

	public static void main(String args[])	{
		Storage aStorage = new Storage();
		System.out.println(aStorage);
	}
}


