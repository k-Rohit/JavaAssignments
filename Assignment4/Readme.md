### Question - 
*Write a menu-driven Java Program for the following: There are 52 cards in
a deck, each of which belongs to one of four suits and one of 13 ranks.
Should have methods:
 a) createDeck() //Can also add this  method as a constructor
 b) printDeck()
 c) printCard()
 d) sameCard() //Card which is from same suit
 e) compareCard() //Card having same rank or number
 f) findCard() //Search for particular card
 g) dealCard() //Print 5 random cards
 h) shuffleDeck() //Randomize the deck*
 
 The program contains two files -
 1. Card.java - It contains all the functions as defined above
 2. Main.java - This contains the main method. A menu driven system has been used giving users the option to select the desired function

### Functions used - 

#### 1. public Card createCard() - 
This function creates a particular card object taking the name of the suit and the rank of the card input from the user

#### 2. public Vector Card createDeck() - 
This function creates a vector of  card objects containing the suit and the rank of the card 
For every suit in the deck we create cards of all the 13 ranks and then add to the vector.

#### 3. public void displayDeck()
This function displays the whole deck and prints the whole deck

#### 4. public void printCard()
Function to print the card. This function takes the rank and the suit of the card and prints the card

#### 5. public void sameCard()
Function to check whether two cards are from the same suit or not
This function takes two indexes with generated by a random number .

#### 6. public void shuffleDeck()
This is function that uses inbuilt shuffle function of the Collection frame work in java to shuffle the
whole deck.

#### 7. public void clearDeck
This function clears the deck or removes all the cards from the vector
Using the getter method it picks up a random card and checks whether the suit of the card is equal or not

#### 6. public void compareCard()
This function is same as the sameCard function.
The only difference being that this checks for the rank of the two cards

#### 7.  public void findCard()
This function finds a card of a particular suit and rank
If the card exists then is notifies accordingly

#### 8. public void dealCard()
This function picks up any 5 random cards from each suite
A random Integer array of size 5 has been created in which the values can range from 0-52
Then using the getter method the cards are printed

