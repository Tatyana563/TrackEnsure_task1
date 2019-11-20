

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.tabToArrays(2,5,0.005);

    }

  public double f(double x) {
        double radian=Math.toRadians(x);
      return (Math.sin(radian))*Math.log10(x);
    }
 public static int stepNumber(double start, double finish, double step){
        int nSteps = (int) Math.round((finish-start)/step + 1);
        return nSteps;
    }
    MyArr tabToArrays(double start, double finish, double step) {
            int nSteps = stepNumber(start,finish,step);
            double[] x = new double[nSteps];
            double[] y = new double[nSteps];
            for (int i=0; i<nSteps; i++) {
                x[i] = start + step*i;
                y[i] = f(x[i]);
            }
       // System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
            return new MyArr(x,y);
        }
    public int numMin(double[] a) {
        int res = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]<a[res]) {
                res = i;
            }
        }
        return res;
    }
    public int numMax(double[] y) {
        int res = 0;
        for (int i = 1; i < y.length; i++) {
            if (y[i]>y[res]) {
                res = i;
            }
        }
        return res;
    }
    private void run1() {
        MyArr myArr = tabToArrays(2, 5, 0.005);
        double[] x = myArr.getX();
        double[] y = myArr.getY();
        int numMax = numMax(y);
        System.out.println("yMax = " + y[numMax]);
        System.out.println("for x = " + x[numMax]);
    }
    public double sum(double[] a) {
        double s = Arrays.stream(a).sum();
        return s;
    }
    public double average(double[] a) {
        double aver=0;
        aver=sum(a)/a.length;
       return aver;
    }

}
