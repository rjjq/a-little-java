package chapter4;

class Skewer extends Shish {
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }
    boolean isVegetarian() {
        return ivFn.forSkewer();
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
