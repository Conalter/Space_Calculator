
public class SpaceCalculator {

    private double earthAge;
    private double mercuryAge;
    private double venusAge;
    private double marsAge;
    private double jupiterAge;
    private double saturnAge;
    private double uranusAge;
    private double neptuneAge;
    private double itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge;

    public SpaceCalculator(double earthAge, double mercuryAge, double venusAge, double marsAge, double jupiterAge, double saturnAge, double uranusAge, double neptuneAge, double itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge) {
        this.earthAge = earthAge;
        this.mercuryAge = mercuryAge;
        this.venusAge = venusAge;
        this.marsAge = marsAge;
        this.jupiterAge = jupiterAge;
        this.saturnAge = saturnAge;
        this.uranusAge = uranusAge;
        this.neptuneAge = neptuneAge;
        this.itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge = itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge;
    }

    public double getEarthAgeSeconds() {
        double earthSeconds = 31557600;
        earthAge = earthAge * earthSeconds;
        return earthAge;
    }

    public double getMercuryAgeYear() {
        double yearPercentage = 0.2408467;
        mercuryAge = mercuryAge / yearPercentage;
        return mercuryAge;
    }

    public double getVenusAgeYear() {
        double yearPercentage = 0.61519726;
        venusAge = venusAge / yearPercentage;
        return venusAge;
    }

    public double getMarsAgeYear(){
        double yearPercentage = 1.8808158;
        marsAge = marsAge / yearPercentage;
        return marsAge;
    }

    public double getJupiterAgeYear(){
        double yearPercentage = 11.862615;
        jupiterAge = jupiterAge / yearPercentage;
        return jupiterAge;
    }

    public double getSaturnAgeYear() {
        double yearPercentage = 29.447498;
        saturnAge = saturnAge / yearPercentage;
        return saturnAge;
    }

    public double getUranusAgeYear() {
        double yearPercentage = 84.016846;
        uranusAge = uranusAge / yearPercentage;
        return uranusAge;
    }

    public double getNeptuneAgeYear() {
        double yearPercentage = 164.79132;
        neptuneAge = neptuneAge / yearPercentage;
        return neptuneAge;
    }

    public double getItsNotReallyAPlanetButWhatTheHellLetsCountPlutoAgeYear(){
        double yearPercentage = 248.00;
        itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge = itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge / yearPercentage;
        return itsNotReallyAPlanetButWhatTheHellLetsCountPlutoAge;
    }
}
