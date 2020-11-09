public class StockApp implements Observer {

    int ibmPrice;
    int applePrice;
    int googlePrice;
    StockServer stockServer = new StockServer();
    String clientName = "";

    public StockApp(StockServer stockServer, String clientName) {
        this.stockServer = stockServer;
        this.clientName = clientName;
        this.stockServer.register(this);
        System.out.println("The name of Client is: " + clientName);
    }

    @Override
    public void update(int ibmPrice, int applePrice, int googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printPrice();
    }

    public void printPrice(){
        System.out.println("The price of IBM Share is: "+ibmPrice);
        System.out.println("The price of Apple Share is: "+applePrice);
        System.out.println("The price of Google Share is: "+googlePrice);
        System.out.println("The Client Name is: "+clientName+"\n");
    }

}
