package com.company;

public class Sphere {
    private int radius;

    public Sphere() {
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void areaSphere() {
        System.out.println(4 * (Math.PI * Math.pow(radius, 2)));
    }

    public void volumeSphere() {
        System.out.println(4 / 3 * Math.PI * Math.pow(radius, 3));

    }

    @Override
    public String toString() {
        return "\nSphere: " +
                "radius " + radius;
    }
}
