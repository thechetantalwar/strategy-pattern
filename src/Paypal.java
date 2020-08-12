public class Paypal implements PaymentStrategy{
    public void pay(int a){
        System.out.println("Payment made by paypal "+a);
    }
    private String user;
    private  String pass;

    public Paypal(String u, String p){
        this.pass=p;
        this.user=u;
    }
}
