package behavioral.memento

class Carataker {
    private val estados: MutableList<ArticleMemento> = ArrayList()

    fun addMemento(memento: ArticleMemento){
        estados.add(memento)
    }

    fun getMemento(index: Int): ArticleMemento{
        return estados[index]
    }
}