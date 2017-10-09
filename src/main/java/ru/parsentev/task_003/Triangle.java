package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    private int area1;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        /*
        create vectors AB and AC
        Если векторы заданы своими координатами a(x1, y1), b(x2, y2) то косое произведение [a, b] = x1y2 — x2y1.
        http://www.cleverstudents.ru/vectors/angle_between_vectors.html
        */
        // Lets find vectors AC and AB
        int vectorAx1= third.getX() - first.getX();
        int vectorAy1= third.getY() - first.getY();
        int vectorAx2= second.getX() - first.getX();
        int vectorAy2= second.getY() - first.getY();

        this.area1 = vectorAx1 * vectorAy2 - vectorAx2 * vectorAy1;

        return this.area1 != 0;
    }

    public double area() {

        if(this.exists()){ return this.area1 / 2; }

        throw new IllegalStateException("Not exist");
    }
}
