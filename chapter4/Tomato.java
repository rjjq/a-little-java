package chapter4;

class Tomato extends Shish {
    Shish s;
    Tomato(Shish _s) {
        s = _s;
    }
    boolean onlyOnions() {
        return ooFn.forTomato(s);
    }
    boolean isVegetarian() {
        return ivFn.forTomato(s);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s.toString() + ")";
    }
}
