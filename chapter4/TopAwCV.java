package chapter4;

class TopAwCV {
    Pizza forCrust() {
        return new Crust();
    }
    Pizza forCheese(Pizza p) {
        return new Cheese(p.topAwC());
    }
    Pizza forOlive(Pizza p) {
        return new Olive(p.topAwC());
    }
    Pizza forAnchovy(Pizza p) {
        return new Cheese(
                new Anchovy(p.topAwC()));
    }
    Pizza forSausage(Pizza p) {
        return new Sausage(p.topAwC());
    }
}
