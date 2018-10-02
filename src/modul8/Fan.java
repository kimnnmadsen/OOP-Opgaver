/*
 9.8 (The Fan class) Design a class named Fan to represent a fan. The class contains:
Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed. 
A private int data field named speed that specifies the speed of the fan (the default is SLOW). 
A private boolean data field named on that specifies whether the fan is on (the default is false). 
A private double data field named radius that specifies the radius of the fan (the default is 5). 
A string data field named color that specifies the color of the fan (the default is blue). 
The accessor and mutator methods for all four data fields.
A no-arg constructor that creates a default fan.
A method named toString() that returns a string description for the fan.
If the fan is on, the method returns the fan speed, color, and radius in one combined string.
If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string. 
Draw the UML diagram for the class then implement the class.
Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
and turn it on to the first object. Assign medium speed, radius 5, color blue,
and turn it off to the second object. Display the objects by invoking their toString method.
 */
package modul8;

import java.util.Date;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class Fan {

    private int speed;
    private boolean on;
    private double radius;
    private String color;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    final int FAST = 3;

    public Fan(int speed, boolean on, double radius, String color) {
        
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String r = "Fan is OFF Color: " + this.color + " Radius: " + this.radius;
        if (on) {
            switch (this.speed) {
                case 1:
                    r = "Fan On, Speed: SLOW Color: " + this.color + " Radius: " + this.radius;
                case 2:
                    r = "Fan On, Speed: MEDIUM Color: " + this.color + " Radius: " + this.radius;
                case 3:
                    r = "Fan On, Speed: FAST Color:" + this.color + " Radius: " + this.radius;
            }
        }
        return r;
    }

    public String toString(Date date) {
        return date + " " + toString();
    }

    public static void main(String[] args) {
        Fan a = new Fan();
        Fan b = new Fan(MEDIUM, false, 5, "blue");
        Date d = new Date();
        a.setSpeed(a.FAST);
        a.setRadius(10);
        a.setColor("yellow");
        a.setOn(true);
        System.out.println(a.toString());
        System.out.println(b.toString(d));
    }
}
