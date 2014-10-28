package chapter4;

class Cheese extends Pizza {
    Pizza p;
    Cheese(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return remFn.forCheese(p);
    }
    Pizza topAwC() {
        return topFn.forCheese(p);
    }
    Pizza subAbC() {
        return subFn.forCheese(p);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
