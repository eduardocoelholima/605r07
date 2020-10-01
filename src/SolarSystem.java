import java.util.Date;

public class  SolarSystem {
	String name = "SolarSystem";
	int       soManyPlanets = 0;
	int       soManyPlanetsSet = 0;
	private double densityOnAverage = 0;
	Planet[]  thePlanets;

	public SolarSystem()	{
	}

	public SolarSystem(int soManyPlanets)	{
		this.soManyPlanets = soManyPlanets;
		thePlanets = new Planet[soManyPlanets];
		for ( int index = 0; index < soManyPlanets; index ++ )
			thePlanets[index] = null;
	}

	private void calculateDensityOnAverage() {
		double allDensity = 0;
		for ( int index = 0; index < soManyPlanets; index ++ )	{
			if ( thePlanets[index] != null )	{
				allDensity += thePlanets[index].getDensity();
			}
		}
		densityOnAverage = allDensity / soManyPlanetsSet;
	}

	public void setPlanet(int nTh, Planet thePlanet)	{
		thePlanets[nTh] = thePlanet;
		soManyPlanetsSet++;
		calculateDensityOnAverage();
	}

	public String toString()	{
		String theSolarSystem = "";
		for ( int index = 0; index < soManyPlanets; index ++ )	{
			if ( thePlanets[index] != null )	{
				theSolarSystem += index + ": " + thePlanets[index] + "\n";
			}
		}
		return theSolarSystem + "\n 	average density: " + densityOnAverage;
	}

	public static void main(String args[])	{
		SolarSystem aSolarSystem = new SolarSystem(8);	// we sadly declassified Pluto

		Planet aPlanet = new Planet("Mercury", 5.427, 87.97, 0);
		aSolarSystem.setPlanet(1, new Planet("Mercury", 5.427, 87.97, 0));

		aPlanet.setName("Saturn");
		aPlanet.setDensity(0.687);
		aPlanet.setOrbitalPeriod(10759.22);
		aPlanet.setNumberOfMoons(82);
		aSolarSystem.setPlanet(6, aPlanet);
/*
                aPlanet.setName("Earth");
                aPlanet.setDensity(5.514);
                aPlanet.setOrbitalPeriod(365.256363004);
                aPlanet.setNumberOfMoons(1);
		aSolarSystem.setPlanet(3, aPlanet);
*/

		System.out.println(aSolarSystem);
	}
}


