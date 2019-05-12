public class Method {
    boolean isRightTriangle(Triangle triangle) {
        return triangle.longestcSide * triangle.longestcSide == triangle.bSide * triangle.bSide +
                triangle.aSide * triangle.aSide;
    }

    boolean xxll(double a, double b, double c) {//jakieś dodatkowe poza zadaniem
        return a * a == b * b + c * c;
    }
}