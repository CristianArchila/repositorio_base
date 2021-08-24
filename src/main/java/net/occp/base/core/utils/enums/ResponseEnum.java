package net.occp.base.core.utils.enums;

/**
 *
 * @author maurizio
 */
public enum ResponseEnum {

    OK("ok"),
    KO("ko");

    private final String value;

    ResponseEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
