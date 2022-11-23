package com.sparta;

import java.math.BigDecimal;

public enum PlanetEnum {
    MERCURY("Mercury", 35, new BigDecimal( "3.30E23")), //Distance from the sun is 35Million km, Mass is in KG
    VENUS ("Venus", 67, new BigDecimal( "4.87E24")),
    EARTH("Earth", 93,new BigDecimal( "5.97E24")),
    MARS("Mars", 142, new BigDecimal( "6.4E23")),
    JUPITER("Jupiter", 484, new BigDecimal( "1.90E27")),
    SATURN("Saturn",889,new BigDecimal( "5.68E26")),
    URANUS("Uranus",2880,new BigDecimal( "8.68E25")),
    NEPTUNE("Neptune",3670, new BigDecimal( "1.02E26"));

    private final String planetName;
    private final int distanceFromSun;
    private final BigDecimal planetMass;

    private PlanetEnum (String planetName, int distanceFromSun, BigDecimal planetMass){
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.planetMass = planetMass;
    }

    public String getPlanetName(){
        return planetName;
    }

    public int getDistanceFromSun(){
        return distanceFromSun;
    }

    public BigDecimal getPlanetMass() {
        return planetMass;
    }
}
