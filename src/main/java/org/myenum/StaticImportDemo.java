package org.myenum;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a,b,c,x;
        a=4;
        b=1;
        c=-3;
        x=(-b+sqrt(pow(b,2)-4*a*c))/(2*a);

        System.out.println(x);
        x=(-b-sqrt(pow(b,2)-4*a*c))/(2*a);
        System.out.println(x);
    }


}
