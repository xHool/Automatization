package Models;

public class Coffee {
    private String name;
    private String description;
    private Additional aditional;

    public Coffee(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Additional getAditional() {
        return aditional;
    }

    public void setAditional(Additional aditional) {
        this.aditional = aditional;
    }

}