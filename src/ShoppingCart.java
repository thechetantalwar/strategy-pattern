import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
    public void addItem(Item a){
        this.items.add(a);
    }
    public void remove(Item a){
        this.items.remove(a);
    }
    public int calculate(){
        int sum = 0;
        for(Item i: items){
            sum += i.getPrice();
        }
        return  sum;
    }
    public void pay(PaymentStrategy p){
        int amount = calculate();
        p.pay(amount);
    }
}

