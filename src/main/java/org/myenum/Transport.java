package org.myenum;

public enum Transport {
    CAR(60),BUS(50),PLANE(300);
    private int speed;
    Transport(int s) {
        speed=s;
    }
    int getSpeed(){
        return speed;
    }
}
