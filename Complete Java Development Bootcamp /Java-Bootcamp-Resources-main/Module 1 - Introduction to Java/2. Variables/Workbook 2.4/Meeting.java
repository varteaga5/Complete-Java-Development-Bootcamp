public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int castedSales = (int)sales;
        int castedProfit = (int)profit;
        int castedRefunds = (int)refunds;
        int castedShipping = (int)shipping;

        System.out.println("This month, we made $" + castedSales + " in sales");
        System.out.println("Factoring in costs, we made $" +castedProfit + " in profit");
        System.out.println("The refunds are at a low $" + castedRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + castedShipping + " in shipping");


    }
}