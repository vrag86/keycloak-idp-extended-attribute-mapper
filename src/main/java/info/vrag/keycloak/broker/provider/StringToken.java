package info.vrag.keycloak.broker.provider;

import info.vrag.keycloak.broker.provider.stringtoken.StringTokenProcess;

class StringToken {
    private String rawValue;
    private String decodedValue;
    private STRING_TOKEN_TYPE type;
    private StringTokenProcess process_class;
    public static enum STRING_TOKEN_TYPE {
        JSON,
        STRING
    };

    public StringToken(String rawValue, STRING_TOKEN_TYPE type, StringTokenProcess process_class) {
        this.rawValue = rawValue;
        this.type = type;
        this.process_class = process_class;
    }

    public StringToken setRawValue(String rawValue) {
        this.rawValue = rawValue;
        return this;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public StringToken setDecodedValue(String decodedValue) {
        this.decodedValue = decodedValue;
        return this;
    }

    public String getDecodedValue() {
        return this.decodedValue;
    }

    public STRING_TOKEN_TYPE getStringTokenType() {
        return this.type;
    }

    public StringToken setStringTokenType(STRING_TOKEN_TYPE type) {
        this.type = type;
        return this;
    }

    public boolean process() {
        String res = process_class.process(getRawValue());
        if (res == null) {
            return false;
        }
        setDecodedValue(res);
        return true;
    }
}
