public enum InternetPlanType {

    Basic(100,2),
    Medium(200,5),
    Advanced(500,15),
    Premium(1000,40),
    Unlimited(2000,999999),
    None(0,0);

    private final double price;
    private final double data;

    InternetPlanType(double price, double data){ 
        this.price = price;
        this.data = data;

    }

    public double getPrice(){
        return price;
    }
    public double getData(){
        return data;
    }




}
