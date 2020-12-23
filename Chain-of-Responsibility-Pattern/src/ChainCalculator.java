public class ChainCalculator {
    public static void main(String[] args) {
        ChainHandler chain1 = new AddNumbers();
        ChainHandler chain2 = new SubNumbers();
        ChainHandler chain3 = new MultiNumbers();
        ChainHandler chain4 = new DivNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request = new Numbers(4, 12, "multi");
        chain1.calculate(request);
    }
}
