package edu.example.mmc;
import java.util.*;
public class LinearRegression{
    private final double A,B,seA,seB,r2;
    private final int n;
    private LinearRegression(double A,double B,double seA,double seB,double r2,int n){
        this.A=A;this.B=B;this.seA=seA;this.seB=seB;this.r2=r2;this.n=n;
    }
    public static LinearRegression fit(List<DataPoint> data,Transformer t){
        if(data.size()<2)throw new IllegalArgumentException();
        var d=data.stream().map(t::transform).toList();
        int n=d.size();double sx=0,sy=0;
        for(var p:d){sx+=p.x();sy+=p.y();}
        double xbar=sx/n,ybar=sy/n,Sxx=0,Sxy=0,Syy=0;
        for(var p:d){double dx=p.x()-xbar,dy=p.y()-ybar;Sxx+=dx*dx;Sxy+=dx*dy;Syy+=dy*dy;}
        double B=Sxy/Sxx,A=ybar-B*xbar;
        double SSR=0;for(var p:d){double r=p.y()-(A+B*p.x());SSR+=r*r;}
        double sig2=SSR/(n-2),seB=Math.sqrt(sig2/Sxx),seA=Math.sqrt(sig2*(1.0/n+xbar*xbar/Sxx));
        double r2=(Sxy*Sxy)/(Sxx*Syy);
        return new LinearRegression(A,B,seA,seB,r2,n);
    }
    public double getA(){return A;}public double getB(){return B;}
    public double getSeA(){return seA;}public double getSeB(){return seB;}
    public double getRSquared(){return r2;}
    public int getN(){return n;}
    public String toString(){return String.format("y=%.6f+%.6fx seA=%.6f seB=%.6f R2=%.6f",A,B,seA,seB,r2);}
}
