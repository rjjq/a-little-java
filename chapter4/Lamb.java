package chapter4;

class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s) {
        s = _s;
    }
    boolean onlyOnions() {
        return ooFn.forLamb(s);
    }
    boolean isVegetarian() {
        return ivFn.forLamb(s);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s.toString() + ")";
    }
}
