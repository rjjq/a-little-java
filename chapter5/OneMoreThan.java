package chapter5;

class OneMoreThan extends Num {
    Num predecessor;
    OneMoreThan(Num _p) {
        predecessor = _p;
    }
    public boolean equals(Object o) {
        if (o instanceof OneMoreThan) {
            return predecessor.equals(
                    ((OneMoreThan)o).predecessor);
        } else {
            return false;
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + predecessor.toString() + ")";
    }
}
