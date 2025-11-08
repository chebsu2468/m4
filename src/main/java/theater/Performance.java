package theater;

/**
 * Class representing a performance of a play.
 * @returns playID and audience
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public String getID() {
        return this.playID;
    }

    public int getAudience() {
        return this.audience;
    }

}
