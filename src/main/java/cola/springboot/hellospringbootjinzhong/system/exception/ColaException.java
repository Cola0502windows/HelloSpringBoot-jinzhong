package cola.springboot.hellospringbootjinzhong.system.exception;

import cola.springboot.hellospringbootjinzhong.system.enums.ErrorCode;

public class ColaException extends RuntimeException {

    private int code = 500;

    public ColaException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public ColaException() {
    }

    public ColaException(String message) {
        super(message);
    }

    public ColaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColaException(Throwable cause) {
        super(cause);
    }

    public ColaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getCode() {
        return code;
    }
}