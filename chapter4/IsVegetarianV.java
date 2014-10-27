class IsVegetarianV {
    boolean forSkewer () {
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
}
