package finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coin {
    protected String side;

    public final String heads = "heads";
    public final String tails = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        Random random = new Random();

        List<String> choices = new ArrayList<>();

        choices.add(tails);
        choices.add(heads);

        setSide(choices.get(random.nextInt(2)));

    }
}