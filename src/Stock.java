//Stock stock1 = new Stock("AAPL", "Apple Inc.", 150.25);

public class Stock {
    private String symbol;
    private String name;
    private float price;

    public Stock(String symbol, String name, float price)
    {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }
}
