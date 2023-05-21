package exceptions;

public class FalhaContrato extends Exception {
    public FalhaContrato() {
    }

    public FalhaContrato(String message) {
        super(message);
    }

    public FalhaContrato(String message, Throwable cause) {
        super(message, cause);
    }

    public FalhaContrato(Throwable cause) {
        super(cause);
    }

    public FalhaContrato(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
