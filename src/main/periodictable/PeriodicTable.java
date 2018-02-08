package main.periodictable;

import java.util.Map;

public class PeriodicTable {
   /* public final static Element hydrogen = Element.HYDROGEN;
    public final static Element helium = Element.HELIUM;
    public final static Element lithium = Element.LITHIUM;
    public final static Element beryllium = Element.BERYLLIUM;
    public final static Element boron = Element.BORON;
    public final static Element carbon = Element.CARBON;
    public final static Element nitrogen = Element.NITROGEN;
    public final static Element oxygen = Element.OXYGEN;
    public final static Element fluorine = Element.FLUORINE;
    public final static Element neon = Element.NEON;
*/
    public static String getElementInfo(Element element) {

        System.out.println(element.getName());
        for (Map.Entry<Integer, Integer> electronDist : element.getElectronDistribution().entrySet()) {
            System.out.printf("%d : %d%n",
                    electronDist.getKey(),
                    electronDist.getValue());
        }
        System.out.printf("%n%n%n");


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
