package info.vrag.keycloak.broker.provider;

class StringToken {
    private String rawValue;
    private String decodedValue;
    private STRING_TOKEN_TYPE type;
    public static enum STRING_TOKEN_TYPE {
        JSON,
        STRING
    };

    public StringToken(String rawValue, STRING_TOKEN_TYPE type) {
        this.rawValue = rawValue;
        this.type = type;
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
}
