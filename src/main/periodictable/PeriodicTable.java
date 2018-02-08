package main.periodictable;

import java.util.Map;

public class PeriodicTable {

    public static String getElementInfo(Element element) {
        return String.format("Element name: %s%n" +
                "Element symbol: %s%n" +
                "Atomic number: %s%n" +
                "Atomic mass: %s%n" +
                "Mass number: %s%n" +
                "Number of neutrons: %s%n",
                element.getName(),
                element.getSymbol(),
                element.getAtomicNum(),
                element.getAtomicMass(),
                element.getMassNum(),
                element.getNumOfNeutrons());
    }


}
