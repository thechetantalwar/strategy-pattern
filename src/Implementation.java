public class Implementation {
    public static void main(String args[]){
        ShoppingCart c =new ShoppingCart();
        Item c1 =new Item("Book",340);
        Item c2 =new Item("Pen",20);
        c.addItem(c1);
        c.addItem(c2);
        c.pay(new CreditCard("Chetan","233223322332",234,"12/22"));
        ShoppingCart b =new ShoppingCart();
        Item b1 =new Item("Book",340);
        Item b2 =new Item("Pen",20);
        b.addItem(b1);
        b.addItem(b2);
        b.pay(new Paypal("chetan.talwar","123243"));
    }
}

