import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsAboutCats {

    private String userId;
    private String text;
    private String type;
    private String userName;
    private int upvotes;

    public FactsAboutCats(
            @JsonProperty("id") String userId,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String userName,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.userId = userId;
        this.text = text;
        this.type = type;
        this.userName = userName;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
    return "Fact " + "\n userId: " + userId +
            "\n text: " + text +
            "\n name: " + userName +
            "\n upvotes: " + upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }
}
