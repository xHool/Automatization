package Models;

public class Additional {
    private String name;
    private String description;
    private String Type;

    public Additional(String name, String description, String type) {
        this.name = name;
        this.description = description;
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
