package chapter5;

class SubstFishV {
    Pie forBot(Fish n, Fish o) {
        return new Bot();
    }
    Pie forTop(Object t,
            Pie r,
            Fish n,
            Fish o) {
        if (o.equals(t)) {
            return new Top(n, r.substFish(n, o));
        } else {
            return new Top(t, r.substFish(n, o));
        }
    }
}
