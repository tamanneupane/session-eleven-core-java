package day7;

public class ImmutableClass {

    private final String a;
    private final String b;

    public ImmutableClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}


