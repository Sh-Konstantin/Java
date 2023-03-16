package lesson_1;

public class program2 {
    public static void main(String[] args) {
        float f = 123.3456f;
        System.out.println(f);
        System.out.println(getType(f));
    }

    static String getType (Object o) {
        return o.getClass().getSimpleName();
    }
}

