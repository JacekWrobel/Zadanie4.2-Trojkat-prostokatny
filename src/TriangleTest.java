public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("UWAGA!!! jako pierwsza wartość definująca trójkąt musi być wskazana wartość najdłuższego " +
                "boku, a długości boków muszą być dodatnie!!!");
        Method method = new Method();
        Triangle triangle = new Triangle(5, 4, 3);
        System.out.println("Trójkąt prostokątny: " +method.isRightTriangle(triangle));

        Triangle triangle1 = new Triangle(5, 5, 5);
        System.out.println("Trójkąt prostokątny: " +method.isRightTriangle(triangle1));

        System.out.println(method.xxll(5, 4, 3));//jakieś dodatkowe poza zadaniem
        System.out.println(method.xxll(3, 3, 3));//jakieś dodatkowe poza zadaniem

    }
}
