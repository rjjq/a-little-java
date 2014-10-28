package chapter4;

abstract class Shish {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    IsVegetarianV ivFn = new IsVegetarianV();
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
    public String toString() {
        return "new " + getClass().getName() + "(" + ooFn.toString() + ")";
    }
}
