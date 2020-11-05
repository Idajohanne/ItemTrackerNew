package ItemTracker.New;

public class Garbage extends Item {

    private static Double depreciationRate = 50;

    public Garbage(String name, int purchaseAmount, int purchaseYear, int numberOfYearsAfterPurchase) {
        super(name, purchaseAmount, purchaseYear, numberOfYearsAfterPurchase);
    }
    
}