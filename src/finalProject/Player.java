package finalProject;

public class Player {
    protected String name;
    protected String field;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Player(String name) {
        setName(name);
    }
}