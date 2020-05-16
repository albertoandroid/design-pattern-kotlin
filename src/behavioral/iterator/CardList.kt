package behavioral.iterator

class CardList(cards: Array<Card?>): List {

    private var cards: Array<Card?> = cards

    override fun iterator(): Iterator {
        return CardIterator(cards)
    }

}