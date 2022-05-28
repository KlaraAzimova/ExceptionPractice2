package com.company;

public class Parallelepiped {
    private int length;
    private int width;
    private int height;

    public Parallelepiped() {
    }

    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int areaParallelepiped() {
        int areaOfParallelepiped = 2 * ((height * length) + (length * width) + (height * width));
        System.out.println("Ploshad parallelepiped: " + areaOfParallelepiped);
        return areaOfParallelepiped;
    }

    public int volumeParallelepiped() {
        int volumeOfParallelepiped = (length * width * height);
        System.out.println("Obem parallelepiped: " + volumeOfParallelepiped);
        return volumeOfParallelepiped;
    }

    @Override
    public String toString() {
        return "Parallelepiped: " +
                "length " + length +
                ", width " + width +
                ", height " + height;

    }
}
