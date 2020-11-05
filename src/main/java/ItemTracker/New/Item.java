package ItemTracker.New;

public abstract class Item {
    
    private int purchaseAmount;
    private int purchaseYear;
    private int numberOfYearsAfterPurchase;
    private String name;

    public Item(String name, int purchaseAmount, int purchaseYear, int numberOfYearsAfterPurchase) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
        this.purchaseYear = purchaseYear;
        this.numberOfYearsAfterPurchase = numberOfYearsAfterPurchase;
    }

    public Double calculateItemWorth() {
        Double itemWorth = purchaseAmount * Math.pow((1 - getDepreciationRate()/100), numberOfYearsAfterPurchase);
        return itemWorth;
    }   

    public String getName() {
        return name;
    }

    public int purchaseYear() {
        return purchaseYear;
    }

    public abstract Double getDepreciationRate();
}
