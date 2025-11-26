package edu.example.mmc;
@FunctionalInterface
public interface Transformer {
    DataPoint transform(DataPoint p);
    static Transformer identity(){return p->p;}
    static Transformer logLog(){return p-> new DataPoint(Math.log(p.x()),Math.log(p.y()));}
    static Transformer logY(){return p-> new DataPoint(p.x(),Math.log(p.y()));}
    static Transformer logX(){return p-> new DataPoint(Math.log(p.x()),p.y());}
}
