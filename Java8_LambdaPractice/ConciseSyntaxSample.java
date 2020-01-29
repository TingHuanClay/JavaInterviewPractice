interface B {
    public void doStringWork(String s);
}

interface C {
    public double doComputeWork(float x, float y);
}

public class ConciseSyntaxSample {

    public ConciseSyntaxSample() {
        B b = this::printOnce;
        b.doStringWork("Hello");
    }

    public static void main(String[] args) {
        B b = ConciseSyntaxSample::printTwice;
        b.doStringWork("Hi");

        new ConciseSyntaxSample();

        C c = Math::pow;
        b.doStringWork(String.valueOf(c.doComputeWork(2.5f, 2)));
    }

    public static void printTwice(String s) {
        System.out.print(s);
        System.out.println(s);
    }

    public void printOnce(String s) {
        System.out.println(s);
    }
}