package chapter2;

class Holder extends Kebab {
    Object o;
    Holder(Object _o) {
        o = _o;
    }
    boolean isVeggie() {
        return true;
    }
    Object whatHolder() {
        return o;
    }
}
