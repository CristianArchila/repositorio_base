package net.occp.base.core.utils.enums;

/**
 *
 * @author maurizio
 */
public enum HttpCustomHeaders {

    PID("x-pid"),
    IP("x-source-ip");

    private final String value;

    HttpCustomHeaders(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
