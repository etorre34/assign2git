package src.com.csc205.demos.module11;

/**
 * Created by Ray on 4/10/2017.
 */
public class ElementNotFoundException extends Exception {

    public ElementNotFoundException() {
        super();
    }

    public ElementNotFoundException(String message) {
        super(message);
    }

    public ElementNotFoundException(String message, Throwable t) {
        super(message, t);
    }

    public ElementNotFoundException(Throwable t) {
        super(t);
    }

}
