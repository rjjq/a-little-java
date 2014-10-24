package chapter2;

class Radish extends Kebab {
    Kebab k;
    Radish(Kebab _k) {
        k = _k;
    }
    boolean isVeggie() {
        return k.isVeggie();
    }
    Object whatHolder() {
        return k.whatHolder();
    }
}
