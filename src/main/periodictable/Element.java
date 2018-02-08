package main.periodictable;

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
    NEON ("Ne", 10, 20.1797);

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

}
