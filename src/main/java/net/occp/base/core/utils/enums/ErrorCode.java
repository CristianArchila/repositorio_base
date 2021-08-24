package net.occp.base.core.utils.enums;

public enum ErrorCode {

    OK("200", "OK"),
    BAD_REQUEST("400", "BAD_REQUEST"),
    UNAUTHORIZED("401", "UNAUTHORIZED"),
    FORBIDDEN("403", "FORBIDDEN"),
    NOT_FOUND("404", "NOT_FOUND"),
    INTERNAL_ERROR("500", "INTERNAL_ERROR"),
    NOT_IMPLEMENTED("501", "NOT_IMPLEMENTED"),
    BAD_ENCRYPTION("40013", "BAD_ENCRYPTION"),
    BAD_DECRYPTION("40014", "BAD_DECRYPTION");

    private final String code;
    private final String message;

    private ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
