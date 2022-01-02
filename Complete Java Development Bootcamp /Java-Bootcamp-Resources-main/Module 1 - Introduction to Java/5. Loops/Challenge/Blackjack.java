import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        String cardString1 = cardString(card1);
        String cardString2 = cardString(card2);
        // after sending cardNumber to randomcard, check if card is J, Q, or K and adjust value to 10
        if(card1 > 10){ 
            card1 = 10;
        }
        if(card2 > 10){ 
            card2 = 10;
        }
        int playerTotal  = (card1 + card2);
        System.out.println("\n You get a \n" + cardString1 + "\n and a \n" + cardString2);

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        System.out.println("your total is: " + playerTotal);
        
        //Task 6 – Get two random cards for the dealer.
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();

        String dealerCardString1 = cardString(dealerCard1);
        String dealerCardString2 = cardString(dealerCard2);

        // after sending cardNumber to randomcard, check if card is J, Q, or K and adjust value to 10
        if(dealerCard1 > 10){ 
            dealerCard1 = 10;
        }
        if(dealerCard2 > 10){ 
            dealerCard2 = 10;
        }
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        System.out.println("The dealer shows \n" + dealerCardString1 + "\nand has a card facing down \n" + faceDown());
        System.out.println("\nThe dealer's total is hidden");
        //       – Print: \nThe dealer's total is hidden

       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        while (true){
            String playerDecision = hitOrStay();

            if(playerDecision.equals("stay")){
                break;
            }
            int additionalCard = drawRandomCard();
            if(additionalCard > 10){ 
                additionalCard = 10;
            } 
            playerTotal += additionalCard;
            String additionalCardString = cardString(additionalCard);
            System.out.println("\n You get a \n" + additionalCardString);
            System.out.println("your new total is: " + playerTotal);
            
            //For tasks 9 to 13, see the article: Blackjack Part II. 

            if(playerTotal > 21){
                System.out.println("Bust! player loses!");
                System.exit(0);
            }
            if(playerTotal == 21){
                System.out.println("Blackjack! player wins!");
                System.exit(0);
            }
        }
        System.out.println("\nDealer's turn");

        int dealerTotal = dealerCard1 + dealerCard2;

        System.out.println("The dealer's cards are \n " + dealerCardString1 + " \n and a \n " + dealerCardString2);

        System.out.println("Dealer's total is " + dealerTotal);

        while(dealerTotal < 17) {
            int additionalCard = drawRandomCard();

            if(additionalCard > 10){ 
                additionalCard = 10;
                dealerTotal += additionalCard;
                String additionalCardString = cardString(additionalCard);
                System.out.println("Dealer hits and gets a \n " + additionalCardString);
                System.out.println("\nDealer's total is " + dealerTotal);
            }

            if(dealerTotal > 21){
                System.out.println("Bust! Dealer loses!");
                System.exit(0);
            }            
        }
        if(playerTotal > dealerTotal) {
            System.out.println("you beat the Dealer!");

        } else {
            System.out.println("Dealer wins!");
        }

         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        double cardVal = Math.random() * 13;
        cardVal += 1;

        return (int) cardVal;
    }
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){
        System.out.println("\nWould you like to hit or stay?");
        String decision = scan.nextLine();
        
        while(!(decision.equals("hit") || decision.equals("stay"))) {
            System.out.println("please try again and type 'hit' or 'stay'");
            decision = scan.next();
        }
        return decision;
    }

    public static String cardString(int cardNumber) {
        String card = "";
        if(cardNumber == 1){
            card =                    
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
        } else if(cardNumber == 2){
            card =                    
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
        } else if(cardNumber == 3){
            card =                    
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
        } else if(cardNumber == 4){
            card =                    
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
        } else if(cardNumber == 5){
            card =                    
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
        } else if(cardNumber == 6){
            card =                    
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
        } else if(cardNumber == 7){
            card =                    
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
        } else if(cardNumber == 8){
            card =                    
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
        } else if(cardNumber == 9){
            card =                    
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
        } else if(cardNumber == 10){
            card =                    
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
        } else if(cardNumber == 11){
            card =                    
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
        } else if(cardNumber == 12){
            card =                    
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
        } else if(cardNumber == 13){
            card =
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";

        }
            return card;
        
    }

    }

