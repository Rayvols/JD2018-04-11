package by.it.kashayed.calc;

public class CalcExeption extends Exception{
    public CalcExeption() {
        super();
    }

    public CalcExeption(String message) {
        super("ERROR:"+message);
    }

    public CalcExeption(String message, Throwable cause) {
        super("ERROR:"+message, cause);
    }

    public CalcExeption(Throwable cause) {
        super(cause);
    }


}
