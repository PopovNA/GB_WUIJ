package org.lesson4;

import java.lang.Math;

public class Triangle {
    public static double area(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if ((a <= 0) || (b <= 0) || (c <= 0) || ((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            area = 0;
        }
        return area;
    }
}
