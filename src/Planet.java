import java.util.Date;

public class  Planet {
	String name = "Planet";
	double  density;
	double  orbitalPeriod;
	int    numberOfMoons;

	public Planet()	{
	}

	public Planet(String name, double density, double orbitalPeriod, int numberOfMoons)	{
		this.name =  name;
		this.density =  density;
		this.orbitalPeriod =  orbitalPeriod;
		this.numberOfMoons =  numberOfMoons;
	}

	public String getName()	{
		return name;
	}

	public double getDensity()	{
		return density;
	}

	public double getOrbitalPeriod()	{
		return orbitalPeriod;
	}

	public double getNumberOfMoons()	{
		return numberOfMoons;
	}

	public void setName(String name)	{
		this.name =  name;
	}

	public void setDensity(double density)	{
		this.density =  density;
	}

	public void setOrbitalPeriod(double orbitalPeriod)	{
		this.orbitalPeriod =  orbitalPeriod;
	}

	public void setNumberOfMoons(int numberOfMoons)	{
		this.numberOfMoons =  numberOfMoons;
	}

	public String toString()	{
		return name + "/" + density + "/" + orbitalPeriod + "/" + numberOfMoons;
	}

	public static void main(String args[])	{
		Planet aPlanet = new Planet("Mercury", 5.427, 87.97, 0);
		System.out.println(aPlanet);
		aPlanet = new Planet();
		aPlanet.setName("Saturn");
		aPlanet.setDensity(0.687);
		aPlanet.setOrbitalPeriod(10759.22);
		aPlanet.setNumberOfMoons(82);
		System.out.println(aPlanet);

		System.out.println("1: " + aPlanet.getName() );
		System.out.println("2: " + aPlanet.getDensity() );
		System.out.println("3: " + aPlanet.getOrbitalPeriod() );
		System.out.println("4: " + aPlanet.getNumberOfMoons() );

	}
}
