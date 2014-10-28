package chapter4;

class IsVegetarianV {
    boolean forSkewer() {
        return true;
    }
    boolean forOnion(Shish s) {
        return s.isVegetarian();
    }
    boolean forLamb(Shish s) {
        return false;
    }
    boolean forTomato(Shish s) {
        return s.isVegetarian();
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
