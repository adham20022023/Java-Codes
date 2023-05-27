package stock;
class newstock
{
    private String name;
    private double previousClosingPrice;
    double currentPrice;
    newstock(String str)
    {
        name=str;
    }
    //************************
    void setname(String name)
    {
        this.name=name;
    }
    String getname()
    {
        return name;
    }
    //************************
    void Set_current_price(double currentPrice)
    {
        this.currentPrice=currentPrice;
    }
    double get_current_price()
    {
        return this.currentPrice;
    }
    //************************
    void set_previous_Closing_Price(double previousClosingPrice)
    {
        this.previousClosingPrice=previousClosingPrice;
    }
    double get_previous_closing_price()
    {
        return this.previousClosingPrice;
    }
    //***********************
    /*
        (V2−V1)/|V1|×100=?
    */
     double getChangePercent()
     {
         return ((this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice)*100;
     }
}
public class Stock {
    public static void main(String[] args) {
        newstock stk=new newstock ("milk");
        stk.set_previous_Closing_Price(100);
        stk.Set_current_price(200);
        System.out.println("Stock Name:"+stk.getname());
        System.out.println("PreviousClosingPrice:"+stk.get_previous_closing_price());
        System.out.println("CurrentPrice:"+stk.get_current_price());
        System.out.println("The Change Persent equal "+stk.getChangePercent()+"%");
    }
    
}
