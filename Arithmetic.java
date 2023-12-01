import java.lang.*;
import java.util.*;

public class Arithmetic{
    int num1;
    int num2;

    public Arithmetic(int a, int b){
        num1 = a;
        num2 = b;
    }

    public int Add(int a, int b){
        return a + b;
    }

    public int Sub(int a, int b){
        return a - b;
    }

    public int Mul(int a, int b){
        return a * b;
    }
    public double Div(int a, int b){
        return (double)(a/b);
    }
}
