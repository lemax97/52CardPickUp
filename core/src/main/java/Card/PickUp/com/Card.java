package Card.PickUp.com;

public class Card extends BaseActor {

    private String rank;
    private String suit;
    public float offsetX;
    public float offsetY;
    public float originalX;
    public float originalY;
    public boolean dragable;

    public Card(String r, String s) {

        super();
        rank = r;
        suit = s;
        dragable = true;
    }

    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public int getRankIndex(){

        return -1;
    }
}
