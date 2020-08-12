public class Item
{
    private String code;
    private int price;
    public  Item(String c, int p){
        this.code= c;
        this.price=p;

    }
    public String getCode(){
        return code;
    }
    public int getPrice()
    {
        return price;
    }
}
