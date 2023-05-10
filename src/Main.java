public class Main {
    public static void main(String[] args) {

        Expression e1 = new Number(1.234);
        Expression e2 = new Number(-1.234);
        Expression e3 = new BinaryOperation(e1, BinaryOperation.DIV, e2);
        System.out.println(e3.evaluate());

        Number n32 = new Number(32.0);
        Number n16 = new Number(16.0);
        BinaryOperation minus = new BinaryOperation(n32, BinaryOperation.MINUS, n16);
        FunctionCall callSqrt = new FunctionCall("sqrt", minus);
        Variable var = new Variable("var");
        BinaryOperation mult = new BinaryOperation(var, BinaryOperation.MUL, callSqrt);
        FunctionCall callAbs = new FunctionCall("abs", mult);
    }
}