package exam01;
public class Card {
    //----------------------------------------------------------------------------------------
    //the following two arrays and three helper methods are provided, do NOT change them!
    private final String[] faces = {
        "Ace",
        "Two",
        "Three",
        "Four",
        "Five",
        "Six",
        "Seven",
        "Eight",
        "Nine",
        "Ten",
        "Jack",
        "Queen",
        "King"
    };
    private final String[] suits = {
        "Clubs",
        "Diamonds",
        "Hearts",
        "Spades"
    };
	
	private char suit;
	private int face;
	
	public Card(int f, char s) {
		face = f;
		suit = s;
	}
	
	public char getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}
    //grabs the face associated with the number passed in by the user.
    //for instance, 1 -> "Ace" and 13 -> "King", 2 -> "Two".
    public String faceString() {
        return faces[face - 1];
    }
    //grabs the suit associated with the char passed in by the user. for instance,
    //'c' -> "Clubs", 'd' -> "Diamonds", 'h' -> "Hearts", 'd' -> "Spades"
    public String suitString() {
        String retVal = "";
        for (String str: suits) {
            if (str.toLowerCase().charAt(0) == suit || str.charAt(0) == suit) retVal = str;
        }
        return retVal;
    }
    //shifts face value to the right num times.
    //for instance, if num = 2 and the currentFace is an "Ten" (ie 10) then we
    //shift to the right by 2 and the shiftedFace is "Queen" (ie 12)
    public int shiftedFace(int num) {
        int shiftedFace = face + num;
        while (shiftedFace > 13) shiftedFace -= 13;
        while (shiftedFace <= 0) shiftedFace += 13;
        return shiftedFace;
    }
	
	public String toString() {
		return faceString() + " of " + suitString();
	}
}
    //----------------------------------------------------------------------------------------