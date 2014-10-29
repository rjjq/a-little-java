package chapter5;

class RemFishV {

    Pie forBot(Fish f) {
        return new Bot();
    }
    Pie forTop(Object t, Pie r, Fish f) {
        if (f.equals(t)) {
            return r.remFish(f);
        } else {
            return new Top(t, r.remFish(f));
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
