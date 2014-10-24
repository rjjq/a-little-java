package chapter2;

class Zucchini extends Kebab {
    Kebab k;
    Zucchini(Kebab _k) {
        k = _k;
    }
    boolean isVeggie() {
        return k.isVeggie();
    }
    Object whatHolder() {
        return k.whatHolder();
    }
}
