package ItemTracker.New;

public class Food extends Item {

    private static Double depreciationRate = 100;

    public Food(String name, int purchaseAmount, int purchaseYear, int numberOfYearsAfterPurchase) {
        super(name, purchaseAmount, purchaseYear, numberOfYearsAfterPurchase);
    }
    
}