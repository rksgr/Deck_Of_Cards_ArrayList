package com.company;
import java.util.ArrayList;


public class DeckOfCards {
    public static void main(String []args){
        // deck of cards suite rank
        String suit[] = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = new String[]{"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        ArrayList <String[]> all_cards = new ArrayList<> ();
        ArrayList <String[]> all_cards_shuffled = new ArrayList<>();
        // Arraylist for player cards
        ArrayList <String[]> card_plr_A = new ArrayList <>();
        ArrayList <String[]> card_plr_B = new ArrayList <>();
        ArrayList <String[]> card_plr_C = new ArrayList <>();
        ArrayList <String[]> card_plr_D = new ArrayList <>();
        // All cards stored in an arraylist
        for (int i=0;i< suit.length;i++){
            for (int j=0;j<rank.length;j++){
                String [] temp_elem = new String[]{suit[i], rank[j]};
                all_cards.add(temp_elem);
            }
        }
        // shuffle the cards
        for (int i = 0;i<(suit.length*rank.length);i++){
            int random_index = (int) (Math.random()*all_cards.size());
            all_cards_shuffled.add(all_cards.get(random_index));
            all_cards.remove(random_index);
            }
        // Allot cards to players
        for (int k=0;k<9;k++){
            card_plr_A.add(all_cards_shuffled.get((4*k)));
            card_plr_B.add(all_cards_shuffled.get((4*k+1)));
            card_plr_C.add(all_cards_shuffled.get((4*k+2)));
            card_plr_D.add(all_cards_shuffled.get((4*k+3)));
        }
        // Print the cards allotted to a given player
        System.out.println("Cards allotted: ");
        for (String[]i: card_plr_D){
            for (String j: i) {
                System.out.println(j);
            }
        }
    }
}
