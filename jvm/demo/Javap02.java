package com.wuhao.jvm;

public class Javap02 {
    private static final int _P_1 = 1;
    public static final int _P_2 = 2;
    public static final int  _P_3;
    static {
        _P_3=_P_1+_P_2;
    }

    public static void main(String[] args) {
        int m = 0, n = 0;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }

    public int add(int a,int b){
        int result = a+b;
        return result;
    }

    public int subtract(int a,int b){
        int result = a-b;
        return result;
    }

    public int multiply(int a,int b){
        int result = a*b;
        return result;
    }

    public int except(int a,int b){
        int result = a/b;
        return result;
    }

    public int residual(int a,int b){
        int result = a%b;
        return result;
    }

    public String exception(){
        String result="";
        try {
            result="sucess";
        }catch (Exception e){
            result="error";
        }finally {
            System.out.println("finally");
        }
        return  result;
    }
}
