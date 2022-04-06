package com.basic;

public class WindChill {
    static double t,v,w;
    public static void main(String[] args) {
        t=Integer.parseInt(args[0]);
        v=Integer.parseInt(args[1]);
        WindChill wc = new WindChill();
        wc.wind();
    }
    void wind() {
        w=35.74 + 0.6215*t+(0.427*t-35.75)*Math.pow(v, 0.16);
        System.out.println("Windchill: "+w);
    }
}
