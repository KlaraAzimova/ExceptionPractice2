package com.company;

public class Cone {
    private int radius;
    private int height;

    public Cone() {
    }

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void areaCone() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    public void volumeCone() {
        System.out.println((height / 3) * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "\nCone: " +
                "radius " + radius +
                ", height " + height;

    }
}
