package ItemTracker.New;

public class Antique extends Item {

    private static Double depreciationRate = 10;

    public Antique(String name, int purchaseAmount, int purchaseYear, int numberOfYearsAfterPurchase) {
        super(name, purchaseAmount, purchaseYear, numberOfYearsAfterPurchase);
    }
    
}
