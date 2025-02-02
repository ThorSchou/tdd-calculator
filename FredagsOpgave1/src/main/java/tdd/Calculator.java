package tdd;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int add(String s){
        String[] data = s.split(",");
        int data0 = Integer.parseInt(data[0]);
        int data1 = Integer.parseInt(data[1]);
        int data2 = Integer.parseInt(data[2]);
        return data0 + data1 + data2;
    }

    public int add(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
