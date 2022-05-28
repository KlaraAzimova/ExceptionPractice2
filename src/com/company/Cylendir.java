package com.company;

public class Cylendir {
    private int radius;
    private int height;

    public Cylendir() {
    }

    public Cylendir(int radius, int height) {
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

    public void areaCylendir() {
        System.out.println(2 * Math.PI * radius * (height + radius));
    }

    public void volumeCylendir() {
        System.out.println(Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "\nCylendir: " +
                "radius " + radius +
                ", height " + height;

    }
}
