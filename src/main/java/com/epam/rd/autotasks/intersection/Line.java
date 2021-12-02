package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k;
    private final int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }


    public Point intersection(Line other) {
        int deltaB = this.b - other.b;
        int deltaK = other.k - this.k;
        if (deltaK == 0)
            return null;
        else {
            int x = deltaB/deltaK;
            return new Point(x, this.k*x + this.b );
        }
    }

}
