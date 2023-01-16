package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,6);
        p.product(5,6,7);
        p.product(100,200);

    }

}
class Product{

    public int product(int x, int y) {
        int z = x+y;
        return z ;
    }
    public int product(int x, int y, int z) {
        int a = x+y+z;
        return a;
    }
    public double product(double x, double y) {
        double b = x+y;
        return b;
    }


}
