package lop_va_doi_tuong.bai_tap.bai2;

import java.util.Scanner;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return status;
    }

    public void setOn(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (getStatus()) {
            if(getSpeed() == SLOW){
                return "Fan{" +
                        "speed= " + "SLOW" +
                        ", fan is on" +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }else if (getSpeed() == MEDIUM) {
                return "Fan{" +
                        "speed= " + "MEDIUM" +
                        ", fan is on" +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }else if (getSpeed()== FAST){
                return "Fan{" +
                        "speed= " + "FAST" +
                        ", fan is on" +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }else {
                return "Fan{" +
                        "speed= " + null +
                        "fan is on" +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }
        } else {
            return "Fan{" +
                    "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        Fan fan3 = new Fan();
        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }

}
