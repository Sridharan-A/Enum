package org.myenum;

public class EnumDemo {
    public static void main(String[] args) {
        Transport t;

        for (Transport x : Transport.values()) {
            System.out.println("Speed of " + x + " is " + x.getSpeed());
        }

        for (Transport a : Transport.values()) {
            System.out.println(a.ordinal());
        }

        Transport c = Transport.CAR;
        Transport b = Transport.BUS;
        Transport p = Transport.PLANE;

        if (c.compareTo(b) < 0) {
            System.out.println(c + " comes before " + b);
        }
        if (c.compareTo(b) > 0) {
            System.out.println(b + " comes before " + c);
        }


    }

}