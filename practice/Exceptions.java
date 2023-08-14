
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        try {
            throw new MyException("My Exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
