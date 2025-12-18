public class Main {

    public static void main(String[] args) {

        double[] x = {1,2,3,4,5};
        double[] y = {2,4.1,5.9,8.05,9.9};

        double sumX=0,sumY=0,sumXY=0,sumX2=0;
        int n=x.length;

        for(int i=0;i<n;i++){
            sumX+=x[i];
            sumY+=y[i];
            sumXY+=x[i]*y[i];
            sumX2+=x[i]*x[i];
        }

        double B=(n*sumXY - sumX*sumY)/(n*sumX2 - sumX*sumX);
        double A=(sumY - B*sumX)/n;

        System.out.println("Ecuación ajustada: Y = "+B+"x + "+A);
    }
}
