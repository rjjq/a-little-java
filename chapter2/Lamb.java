package chapter2;

class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s) {
        s = _s;
    }
    boolean onlyOnions() {
        return false;
    }
    boolean isVegetarian() {
        return false;
    }
}
