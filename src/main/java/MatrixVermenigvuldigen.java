import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixVermenigvuldigen {


    public static void main(String[] args) {

        RealMatrix a = MatrixUtils.createRealMatrix(3,2);
        a.setEntry(0,0,1);
        a.setEntry(0,1,2);
        a.setEntry(1,0,3);
        a.setEntry(1,1,4);
        a.setEntry(2,0,5);
        a.setEntry(2,1,2);

        RealMatrix b = MatrixUtils.createRealMatrix(2,3);
        b.setEntry(0,0,2);
        b.setEntry(0,1,2);
        b.setEntry(0,2,4);
        b.setEntry(1,0,0);
        b.setEntry(1,1,1);
        b.setEntry(1,2,0);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.multiply(b));

    }



}
