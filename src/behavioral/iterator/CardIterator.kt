package behavioral.iterator

class CardIterator(cards: Array<Card?>): Iterator {
    private var cards: Array<Card?> =  cards
    private var position = 0

    override fun hasNext(): Boolean {
        return position < cards.size
    }

    override fun next(): Any? {
        return cards[position++]
    }

    override fun currentItem(): Any? {
        return cards[position]
    }
}