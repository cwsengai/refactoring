package theater;

/**
 * Represents a play with a name and type.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public final String getName() {
        return name;
    }
    public final String getType() {
        return type;
    }
}
