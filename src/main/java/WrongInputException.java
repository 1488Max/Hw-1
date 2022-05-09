public class WrongInputException extends Exception {
    public  WrongInputException(String message) {
        super(message);
        System.out.println(message);
    }
}
