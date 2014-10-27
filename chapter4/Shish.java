package chapter4;

abstract class Shish {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    abstract boolean onlyOnions();
    IsVegetarianV ivFn = new IsVegetarianV();
    public String toString() {
        return "new " + getClass().getName() + "(" + ooFn.toString() + ")";
    }
}
