package Exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {
    @Test
    void Constructor_calculatesRadius() {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(1, 0);
        Circle c1 = new Circle(p1, p2);

        assertThat(c1.getRadius()).isEqualTo(1);
    }

    @Test
    void getPerimeter_calculatePerimeter() {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(1, 0);
        Circle c1 = new Circle(p1, p2);

        assertThat(c1.getPerimeter()).isEqualTo(2 * Math.PI);
    }

    @Test
    void getArea_calculateArea() {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(1, 0);
        Circle c1 = new Circle(p1, p2);

        assertThat(c1.getArea()).isEqualTo(Math.PI);
    }
}
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;class CircleTest {    private Circle circle;
//    Point centre = new Point(1d, 3d);
//    Point edge = new Point(3d, 5d);    @BeforeEach
//        void setup() {
//        circle = new Circle(centre, edge);
//    }
//    @Test
//    void should_ReturnCorrectRadius() {        //when
//        double result = circle.getRadius();        //then
//        assertEquals(2.8284271247461903, result);
//    }
//    @Test
//    void should_ReturnCorrectPerimeter() {        //when
//        double result = circle.getPerimeter();
//        //then
//        assertEquals(17.771531752633464, result);
//    }    @Test
//    void should_ReturnCorrectArea() {        //when
//        double result = circle.getArea();
//        //then
//        assertEquals(2.9809001788581804, result);
//    }
//}