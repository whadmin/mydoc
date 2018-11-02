package com.wuhao.jvm;

public class Javap01 {
    private static final int _P_1 = 1;
    public static final int _P_2 = 2;
    public static final int _P_3;
    private int count = 0;

    static {
        _P_3 = _P_1 + _P_2;
    }

    public static void main(String[] args) {
        int m = 0, n = 0;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }

    public int add(int i, int j) {
		String result="";
        int x = i;
        int y = i;
        return x+y;
    }

    public String link(String a,String b){
        String x=a;
        String y=b;
        return  a+b;
    }

    public void test3(){
        count++;
    }
}
