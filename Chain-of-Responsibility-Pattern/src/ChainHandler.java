public interface ChainHandler {
    public void setNextChain(ChainHandler nextChain);
    public void calculate(Numbers request);
}
