/**
 * 
 */
package excepciones;

/**
 *
 * @author/(s): Daniel Alejandro Castro Félix - 235294.
 *
 */
public class DaoException extends Exception{

    public DaoException() {
    }
    
    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(Throwable cause) {
        super(cause);
    }

    public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
