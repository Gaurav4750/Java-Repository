import java.lang.*;
import java.util.*;
import Arithmetic.*;

public class ArithmeticRunner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in_num1 = sc.nextInt();
        int in_num2 = sc.nextInt();

        Arithmetic ar = new Arithmetic(in_num1,in_num2);
        int add = ar.Add(in_num1,in_num2);
        int sub = ar.Sub(in_num1, in_num2);
        int mul = ar.Mul(in_num1, in_num2);
        double div = ar.Div(in_num1, in_num2);

        System.out.println("Addition: "+add+"\nSubraction: "+sub+"\nMultiplication: "+mul+"\nDivision: "+div);
    }
}
