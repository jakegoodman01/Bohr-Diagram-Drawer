package main.periodictable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Element {
    HYDROGEN ("H", 1, 1.0079),
    HELIUM ("He", 2, 4.0026),
    LITHIUM ("Li", 3, 6.941),
    BERYLLIUM ("Be", 4, 9.0122),
    BORON ("B", 5, 10.811),
    CARBON ("C", 6, 12.0107),
    NITROGEN ("N", 7, 14.0067),
    OXYGEN ("O", 8, 15.9994),
    FLUORINE ("F", 9, 18.9984),
    NEON ("Ne", 10, 20.1797),
    SODIUM ("Na", 11, 22.9897),
    MAGNESIUM ("Mg", 12, 24.305),
    ALUMINUM ("Al", 13, 26.9815),
    SILICON ("Si", 14, 28.0855),
    PHOSPHOROUS ("P", 15, 30.9738),
    SULFUR ("S", 16, 32.065),
    CHLORINE ("Cl", 17, 35.453),
    ARGON ("Ar", 18, 39.948),
    POTASSIUM ("K", 19, 39.10);

    private String symbol;
    private int atomicNum;
    private double atomicMass;

    Element(String symbol, int atomicNum, double atomicMass) {
        this.symbol = symbol;
        this.atomicNum = atomicNum;
        this.atomicMass = atomicMass;
    }

    public String getName () {
        return toString();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public int getMassNum () {
        return (int)Math.round(atomicMass);
    }

    public int getNumOfProtons () {
        return atomicNum;
    }

    public int getNumOfNeutrons () {
        return getMassNum() - getNumOfProtons();
    }

    public Map<Integer, Integer> getElectronDistribution() {
        int numOfElectrons = getNumOfProtons();
        Map<Integer, Integer> electronDistribution = new HashMap<>();

        // Filling up the first orbit
        if (atomicNum == 1) {
            electronDistribution.put(1, 1);
            numOfElectrons--;
        } else {
            electronDistribution.put(1, 2);
            numOfElectrons -= 2;
        }

        // Filling up the other orbits
        int currentOrbit = 2;
        while (numOfElectrons > 0) {
            if (numOfElectrons <= 8) {
                electronDistribution.put(currentOrbit, numOfElectrons);
                numOfElectrons = 0;
            } else {
                electronDistribution.put(currentOrbit, 8);
                numOfElectrons -= 8;
            }
            currentOrbit++;
        }
        return electronDistribution;
    }

    public int getNumOfValenceElectrons () {
        List<Integer> electrons = new ArrayList<>(getElectronDistribution().values());
        return electrons.get(electrons.size() - 1);
    }

    public int getNumOfOrbits () {
        List<Integer> orbits = new ArrayList<>(getElectronDistribution().keySet());
        return orbits.get(orbits.size() - 1);
    }
}
