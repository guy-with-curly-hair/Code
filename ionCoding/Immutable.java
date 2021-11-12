package ionCoding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Immutable {

    private String a;
    private int b;
    private Map<String, String> map;

    public String getA() {
        return a;
    }

    public Immutable(String a, int b, Map<String, String> map) {
        this.a = a;
        this.b = b;
        this.map = Collections.unmodifiableMap(map);
        // new HashMap(map);
    }

    public Map<String, String> getMap() {
        return new HashMap<>(this.map);
    }

    public Immutable(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
