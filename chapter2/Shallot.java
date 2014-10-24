package chapter2;

class Shallot extends Kebab {
    Kebab k;
    Shallot(Kebab _k) {
        k = _k;
    }
    boolean isVeggie() {
        return k.isVeggie();
    }
    Object whatHolder() {
        return k.whatHolder();
    }
}
