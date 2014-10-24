package chapter2;

class Pepper extends Kebab {
    Kebab k;
    Pepper(Kebab _k) {
        k = _k;
    }
    boolean isVeggie() {
        return k.isVeggie();
    }
    Object whatHolder() {
        return k.whatHolder();
    }
}
