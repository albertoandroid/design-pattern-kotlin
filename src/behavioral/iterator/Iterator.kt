package behavioral.iterator

interface Iterator {

    fun hasNext(): Boolean
    fun next(): Any?
    fun currentItem(): Any?
}