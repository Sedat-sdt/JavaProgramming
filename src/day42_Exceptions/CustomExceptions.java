package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}

//class NoBreakException

public class CustomExceptions {
    public static void main(String[] args) {

        throw  new FadyException("It's time to short break");





    }

}
