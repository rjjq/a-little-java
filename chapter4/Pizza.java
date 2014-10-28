package chapter4;

abstract class Pizza {
    RemAV remFn = new RemAV();
    TopAwCV topFn = new TopAwCV();
    SubAbCV subFn = new SubAbCV();
    abstract Pizza remA();
    abstract Pizza topAwC();
    abstract Pizza subAbC();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
