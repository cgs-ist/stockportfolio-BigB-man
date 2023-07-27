//Stock stock1 = new Stock("AAPL", "Apple Inc.", 150.25);

public class Stock {
    public String symbol;
    public String name;
    public double price;

    public Stock(String symbol, String name, double price)
    {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }
}
