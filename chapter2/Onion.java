package chapter2;

class Onion extends Shish {
    Shish s;
    Onion(Shish _s) {
        s = _s;
    }
    boolean onlyOnions () {
        return s.onlyOnions();
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
