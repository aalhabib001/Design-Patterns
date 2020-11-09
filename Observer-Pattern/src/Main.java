public class Main {
    public static void main(String[] args){
        StockServer stockServer = new StockServer();

        StockApp stockApp1 = new StockApp(stockServer,"Habib");
        StockApp stockApp2 = new StockApp(stockServer,"Shohan");

        stockServer.setApplePrice(100);
        stockServer.setGooglePrice(200);
        stockServer.setIbmPrice(50);
    }

}
