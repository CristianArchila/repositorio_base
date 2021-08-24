package net.occp.base.core.exception;

import net.occp.base.core.utils.enums.ErrorCode;

public class BusinessException extends Exception {
    
    private final ErrorCode code;

    private final String message;

    public BusinessException() {
        this.code = ErrorCode.INTERNAL_ERROR;
        this.message = "";
    }

    public BusinessException(ErrorCode code) {
        this.code = code;
        this.message = "";
    }

    public BusinessException(ErrorCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getExceptionCode() {
        return code.getCode();
    }

    public String getExceptionMessage() {
        return code.getMessage() + ", " + message;
    }

    public ErrorCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
