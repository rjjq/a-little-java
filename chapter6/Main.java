package chapter6;

public class Main {
    public static void main(String args[]) {
        Pie p = new Top(new Anchovy(),
                new Top(new Integer(3),
                    new Top(new Zero(),
                        new Bot())))
            .rem(new RemV(),
                    new Zero());
        System.out.println(p.toString());

        Pie p1 = new Top(new Integer(3),
                new Top(new Integer(2),
                    new Top(new Integer(3),
                        new Bot())))
            .subst(new SubstV(new Integer(5),
                    new Integer(3)));
        System.out.println(p1.toString());
    }
}
