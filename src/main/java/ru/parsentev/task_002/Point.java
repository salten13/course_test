package ru.parsentev.task_002;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class Point defines a point in coordination system (x, y).
 * @author parsentev
 * @since 19.07.2016
 */
public class Point {
    private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {

        //sqrt((x2 - x1)^2 + (y2 - y1)^2)

        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public int getX() { return x; }

    public int getY() { return y; }
}
