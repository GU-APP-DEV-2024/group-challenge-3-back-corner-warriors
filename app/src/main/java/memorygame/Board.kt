package memorygame

class Board() {
    //Constructor to create board of different sizes.
    // Assign
    private val availableCards = arrayOf<Card>(Card('c', "a"), Card('h', "10"), Card('d', "3"))
    private var cards: Array<Card> = emptyArray<Card>()
    private var suits: Array<Char> = arrayOf<Char>('c', 'h', 'd', 's')
    private var ranks: Array<String> = arrayOf<String>("a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k")

//    init {
//        for(i in 0..6 step 2){
//            val suit = selectSuit()
//            val rank = selectRank()
//            cards[i] = Card(suit, rank)
//            cards[i+1] = Card(suit, rank)
//        }
//        cards.shuffle()
//    }

    init {
        for(i in 0..2){
            cards[2*i] = availableCards.random()
            cards[2*i+1] = availableCards.random()
        }
        cards.shuffle()
    }

    fun getValueAt(index:Int): Card {
        return cards[index]
    }

    data class Card(val suit: Char, val rank: String) {

    }

    fun selectSuit(): Char {
        val suit = suits.random()
        return suit
    }
    fun selectRank(): String {
        val rank = ranks.random()
        return rank
    }
}
