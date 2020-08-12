public class CreditCard implements PaymentStrategy {
    private String name;
    private String number;
    private int cvv;
    private String expiry;

    public CreditCard(String name,String number,int cvv, String expiry){
        this.name=name;
        this.number=number;
        this.cvv=cvv;
        this.expiry=expiry;
    }

    public void pay(int a){
        System.out.println(a +" payment made by card ");
    }
}
