

public final class Calculator implements iCalculable {

    private int primaryArg;
    private int secondArg;
    private int zOne;
    private int zTwo;
    private int z1;
    private int z2;
    private int z3;
    private int z4;

    public Calculator(int primaryArg, int secondArg) {
        this.primaryArg = primaryArg;
        this.secondArg =secondArg;
    }

    @Override
    public iCalculable sum(int arg,int arg2) {
        primaryArg += arg;
        secondArg += arg2;
        return this;
    }

    // @Override
    // public iCalculable multi(int arg,int arg2) {
    //     z1 = primaryArg * secondArg;
    //     z2 = arg * arg2;
    //     z3 = primaryArg*arg2;
    //     z4 = arg*secondArg;
    //     zOne = z1-z2;
    //     zTwo= z3+z4;
    //     return zOne,zTwo;
    // }

    @Override
    public int getResult() {
        return primaryArg;
    }

    @Override
    public iCalculable multi(int arg, int arg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multi'");
    }


}
