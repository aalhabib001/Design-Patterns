public class DivNumbers implements ChainHandler{
    private ChainHandler nextChain;

    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationMethod().equals("div")){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = "
                    + (request.getNumber1() / request.getNumber2()));
        }
        else{
            System.out.println("This System Only Accepts add, sub, multi, div");
        }
    }
}
