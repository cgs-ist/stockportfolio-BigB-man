import java.util.HashMap; // import the HashMap class

public class StockPortfolio {
    HashMap<Stock, Integer> portfolio = new HashMap<Stock, Integer>();

    public void addStock(Stock name, int number)
    {
        this.portfolio.put(name, number);
    }
    public void viewPortfolio()
    {
        for (Stock i : portfolio.keySet())
        {
            System.out.println(i.name + "(" + i.symbol + "), Price of stock = $"+ i.price + ", Number of shares = " + portfolio.get(i));
        }
    }
}
