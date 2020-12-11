public class TriangleClassifier {

    public static final String NOT_TRIANGLE = "Khong phai tam giac";
    public static final String NORMAl_TRIANGLE = "Tam giac thuong";
    public static final String ISOSCELES_TRIANGLE = "Tam giac can";
    public static final String EQUILATERA_TRIANGLE = "Tam giac deu";

    public static String checkTriangle(int a, int b, int c) {
        if (check(a,b,c)) return NOT_TRIANGLE;
        if (a == b && a == c) return ISOSCELES_TRIANGLE;
        if (a == b || a == c || b == c) return ISOSCELES_TRIANGLE;
        return NORMAl_TRIANGLE;
    }

    private static boolean check(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c<= 0) return true;
        return (a > b + c || b > a + c || c > a + b);
    }

}
