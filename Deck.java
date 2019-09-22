package exam01;

import java.util.List;
import java.util.ArrayList;

public class Deck { 

	List<Card> cards = new ArrayList<>();
	public void insertCard(Card c) {
		cards.add(c);
	}
	
	public Card earliestCard() {
		if (cards.size() == 0) {
			return null;
		}
		
		int lowestFace = cards.get(0).getFace();
		char lowestSuit = cards.get(0).getSuit();
		
		for (int i=1; i<cards.size(); i++) {
			
			if (cards.get(i).getSuit() < lowestSuit) {
				lowestSuit = cards.get(i).getSuit();
			}
			if (cards.get(i).getFace() < lowestFace) {
				lowestFace = cards.get(i).getFace();
			}
		}
		Card lowestCard = new Card(lowestFace, lowestSuit);
		
		return lowestCard;
	}
	
	public void shiftFaces(int num) {
		for (int i=0; i<cards.size(); i++) {
			
			Card card = cards.get(i);
			int newFace = card.shiftedFace(num);
			char suit = card.getSuit();
			
			Card newCard = new Card(newFace, suit);
			cards.set(i, newCard);
		}	
	}
	
	public String toString() {
		return cards.toString();
	}
}