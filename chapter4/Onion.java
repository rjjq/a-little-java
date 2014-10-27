package chapter4;

class Onion extends Shish {
    Shish s;
    Onion(Shish _s) {
        s = _s;
    }
    boolean onlyOnions() {
        return ooFn.forOnion(s);
    }
    boolean isVegetarian() {
        return ivFn.forOnion(s);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s.toString() + ")";
    }
}
