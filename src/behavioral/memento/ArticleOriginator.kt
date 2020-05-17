package behavioral.memento

class ArticleOriginator(var id: Int, var title: String, var text: String) {

    fun createMemento(): ArticleMemento{
        var memento = ArticleMemento(id, title, text)
        return memento
    }

    fun restore(memento: ArticleMemento){
        this.id = memento.id
        this.text = memento.text
        this.title = memento.title
    }
}