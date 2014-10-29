package chapter5;

public class Main {
    public static void main(String args[]) {
        Pie p = new Top(new Integer(2),
                new Top(new Integer(3),
                    new Top(new Integer(2),
                        new Bot())))
            .rem(new Integer(3));
        System.out.println(p.toString());

        Pie p1 = new Top(new Anchovy(),
                new Bot())
            .rem(new Anchovy());
        System.out.println(p1.toString());

        Pie p2 = new Top(new Anchovy(),
                new Top(new Integer(3),
                    new Top(new Zero(),
                        new Bot())))
            .rem(new Zero());
        System.out.println(p2.toString());

        Pie p3 = new Top(new Integer(3),
                new Top(new Integer(2),
                    new Top(new Integer(3),
                        new Bot())))
            .subst(new Integer(5),
                    new Integer(3));
        System.out.println(p3.toString());
    }
}
