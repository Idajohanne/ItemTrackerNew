package ItemTracker.New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemTracker {
    private List<Item> items;

    public ItemTracker(){
        items = new ArrayList<>();
    }

    public void addItem(String name, int purchaseAmount, int purchaseYear, int numberOfYearsAfterPurchase){
        items.add(new Item(name, purchaseAmount, purchaseYear, numberOfYearsAfterPurchase));
    }

    public void removeItem(String name){
        Iterator<Item> it = items.iterator();
        while(it.hasNext){
            if(it.next().getName().equals(name)){
                it.remove();
            }

        }
    }    
}
