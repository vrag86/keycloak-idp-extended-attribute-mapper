package info.vrag.keycloak.broker.provider.stringtoken;

public class StringTokenField implements StringTokenProcess {
    public String process(String field) {
        return field.replaceAll("\"", "");
    }
}
