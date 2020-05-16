package behavioral.interpreter

class TerminalExpression(text: String): Expression {
    private var text: String

    init {
        this.text = text
    }

    override fun interpret(context: String): Boolean {
        if(context.contains(text)){
            return true
        }
        return false
    }
}