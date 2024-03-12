

public final class Calculator implements iCalculable {

    private int primaryArg;
    private int secondArg;

    public Calculator(int primaryArg, int secondArg) {
        this.primaryArg = primaryArg;
        this.secondArg =secondArg;
    }

    @Override
    public iCalculable sum(int arg,int arg2) {
        primaryArg += arg;
        secondArg+=arg2;
        return this;
    }

    @Override
    public iCalculable multi(int arg,int arg2) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
