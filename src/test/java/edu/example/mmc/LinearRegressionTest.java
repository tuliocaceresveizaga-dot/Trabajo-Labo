package edu.example.mmc;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class LinearRegressionTest{
    @Test void testAB(){
        var d=List.of(new DataPoint(0,2),new DataPoint(1,5),new DataPoint(2,8));
        var lr=LinearRegression.fit(d,Transformer.identity());
        assertEquals(2,lr.getA(),1e-9);
        assertEquals(3,lr.getB(),1e-9);
    }
}
