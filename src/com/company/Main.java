package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scannerFor = new Scanner(System.in);
        System.out.println("Для какой фигуры надо рассчитать площадь и обьем?" +
                "  \nparallelepiped, sphere, cylendir, cone ");

        while (true) {
            String figura = scannerFor.nextLine();

            switch (figura.toLowerCase(Locale.ROOT)) {
                case "parallelepiped":
                    try {
                        System.out.print("length: ");
                        int length = scannerFor.nextInt();
                        if (length < 0) {
                            throw new YourException("Length ters san bolboit! ");
                        }
                        System.out.print("width: ");
                        int width = scannerFor.nextInt();
                        if (width < 0) {
                            throw new YourException("Width ters san bolboit! ");
                        }
                        System.out.print("height: ");
                        int height = scannerFor.nextInt();
                        if (height < 0) {
                            throw new YourException("Height ters san bolboit! ");
                        }
                        Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                        parallelepiped.areaParallelepiped();
                        parallelepiped.volumeParallelepiped();

                    } catch (YourException e) {
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("San jazynyz... ");
                    }
                    break;

                case "sphere":
                    try {
                        System.out.print("radius: ");
                        int radius = scannerFor.nextInt();
                        if (radius < 0) {
                            throw new YourException("Radius ters san bolboit! ");
                        }
                        Sphere sphere = new Sphere(radius);
                        sphere.areaSphere();
                        sphere.volumeSphere();

                    } catch (YourException r) {
                        System.out.println(r.getMessage());
                    } catch (InputMismatchException r) {
                        System.out.println("San jazynyz! ");

                    }
                    break;
                case "cylendir":
                    try {
                        System.out.print("radius: ");
                        int radius = scannerFor.nextInt();
                        if (radius < 0) {
                            throw new YourException("Radius ters san bolboit! ");
                        }
                        System.out.print("height: ");
                        int height = scannerFor.nextInt();
                        if (height < 0) {
                            throw new YourException("Height ters san bolboit! ");
                        }
                        Cylendir cylendir = new Cylendir(radius, height);
                        cylendir.areaCylendir();
                        cylendir.volumeCylendir();

                    } catch (YourException r1) {
                        System.out.println(r1.getMessage());
                    } catch (InputMismatchException r1) {
                        System.out.println("San jazynyz! ");

                    }
                    break;
                case "cone":
                    try {
                        System.out.print("radius: ");
                        int radius = scannerFor.nextInt();
                        if (radius < 0) {
                            throw new YourException("Radius ters san bolboit! ");
                        }
                        System.out.print("height: ");
                        int height = scannerFor.nextInt();
                        if (height < 0) {
                            throw new YourException("Height ters san bolboit! ");
                        }
                        Cone cone = new Cone(radius, height);
                        cone.areaCone();
                        cone.volumeCone();

                    } catch (YourException c) {
                        System.out.println(c.getMessage());
                    } catch (InputMismatchException c) {
                        System.out.println("San jazynyz! ");
                    }
                    break;

                default:
                    System.out.println("Для какой фигуры надо рассчитать площадь и обьем?" +
                            "  \nparallelepiped, sphere, cylendir, cone ");
            }

        }
    }
}