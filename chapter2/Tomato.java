package chapter2;

class Tomato extends Shish {
    Shish s;
    Tomato (Shish _s) {
        s = _s;
    }
    boolean onlyOnions() {
        return false;
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
