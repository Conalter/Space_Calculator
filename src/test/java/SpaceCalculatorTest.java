import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceCalculatorTest {

    SpaceCalculator spaceCalculator;

    @Before
    public void before(){
        this.spaceCalculator = new SpaceCalculator(50, 50,50, 50,50,50,50,50,50);
    }

    @Test
    public void secondsOnEarth(){
        assertEquals(1577880000, spaceCalculator.getEarthAgeSeconds(),0.01);
    }

    @Test
    public void yearsOnMercury(){
        assertEquals(207.600935, spaceCalculator.getMercuryAgeYear(), 0.01);
    }

    @Test
    public void yearsOnVenus(){
        assertEquals(81.2747443, spaceCalculator.getVenusAgeYear(), 0.01);
    }

    @Test
    public void yearsOnMars(){
        assertEquals(26.5842088, spaceCalculator.getMarsAgeYear(), 0.01);
    }

    @Test
    public void yearsOnJupiter(){
        assertEquals(4.2149222, spaceCalculator.getJupiterAgeYear(), 0.01);
    }

    @Test
    public void yearsOnSaturn(){
        assertEquals(1.6979371, spaceCalculator.getSaturnAgeYear(), 0.01);
    }

    @Test
    public void yearsOnUranus(){
        assertEquals(0.5951187, spaceCalculator.getUranusAgeYear(), 0.01);
    }

    @Test
    public void yearsOnNeptune(){
        assertEquals(0.3034140, spaceCalculator.getNeptuneAgeYear(), 0.01);
    }

    @Test
    public void yearsOnPluto(){
        assertEquals(0.2016129, spaceCalculator.getItsNotReallyAPlanetButWhatTheHellLetsCountPlutoAgeYear(), 0.01);
    }

//        private static final double MAXIMUM_DELTA = 1E-02;
//
//        @Test
//        public void ageOnEarth() {
//            SpaceAge age = new SpaceAge(1000000000);
//            assertEquals(31.69, age.onEarth(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnMercury() {
//            SpaceAge age = new SpaceAge(2134835688);
//            assertEquals(280.88, age.onMercury(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnVenus() {
//            SpaceAge age = new SpaceAge(189839836);
//            assertEquals(9.78, age.onVenus(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnMars() {
//            SpaceAge age = new SpaceAge(2329871239L);
//            assertEquals(39.25, age.onMars(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnJupiter() {
//            SpaceAge age = new SpaceAge(901876382);
//            assertEquals(2.41, age.onJupiter(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnSaturn() {
//            SpaceAge age = new SpaceAge(3000000000L);
//            assertEquals(3.23, age.onSaturn(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnUranus() {
//            SpaceAge age = new SpaceAge(3210123456L);
//            assertEquals(1.21, age.onUranus(), MAXIMUM_DELTA);
//        }
//        @Test
//        public void ageOnNeptune() {
//            SpaceAge age = new SpaceAge(8210123456L);
//            assertEquals(1.58, age.onNeptune(), MAXIMUM_DELTA);
//        }
    }
