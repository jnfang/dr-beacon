package drbeacon.models;

/**
 * Created by bogdanbuduroiu on 08/10/2016.
 */

public class Historic {

    private String heading;
    private String description;

    public Historic(String heading, String description) {
        this.heading = heading;
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescription() {
        return description;
    }
}
