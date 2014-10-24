package chapter2;

class Shrimp extends Kebab {
    Kebab k;
    Shrimp(Kebab _k) {
        k = _k;
    }
    boolean isVeggie() {
        return false;
    }
    Object whatHolder() {
        return k.whatHolder();
    }
}
