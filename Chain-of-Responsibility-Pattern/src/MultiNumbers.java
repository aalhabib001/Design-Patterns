public class MultiNumbers  implements ChainHandler{private ChainHandler nextChain;

    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationMethod().equals("multi")){
            System.out.println(request.getNumber1() + " x " + request.getNumber2() + " = "
                    + (request.getNumber1() * request.getNumber2()));
        }
        else{
            this.nextChain.calculate(request);
        }
    }
}
