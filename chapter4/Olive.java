package chapter4;

class Olive extends Pizza {
    Pizza p;
    Olive(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return remFn.forOlive(p);
    }
    Pizza topAwC() {
        return topFn.forOlive(p);
    }
    Pizza subAbC() {
        return subFn.forOlive(p);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}

