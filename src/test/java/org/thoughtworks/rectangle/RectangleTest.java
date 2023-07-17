package org.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import org.thoughtworks.rectangle.Rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {

    @Test
    public void shouldReturnAreaSixWhenLengthIsTwoAndBreadthIsThree(){
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double expectedArea = 6.0;

        double actualArea = rectangle.area();

        assertThat(actualArea,is(closeTo(expectedArea, 0.001)));
    }

    @Test
    public void shouldReturnPerimeterTenWhenLengthIsTwoAndBreadthIsThree(){
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        double expectedPerimeter = 10.0;

        double actualPerimeter = rectangle.perimeter();

        assertThat(actualPerimeter, is(closeTo(expectedPerimeter , 0.001)));
    }

    @Test
    public void shouldReturnAreaFourWhenSideIsTwo() {
        Rectangle square = Rectangle.createSquare(2);
        double expectedArea = 4;

        double actualArea = square.area();

        assertThat(actualArea,is(closeTo(expectedArea, 0.001)));
    }
    @Test
    public void shouldReturnPerimeterEightWhenSideIsTwo(){
        Rectangle square = Rectangle.createSquare(2);
        double expectedPerimeter = 8;

        double actualPerimeter = square.perimeter();

        assertThat(actualPerimeter,is(closeTo(expectedPerimeter, 0.001)));
    }
}