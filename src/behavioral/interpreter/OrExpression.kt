package behavioral.interpreter

class OrExpression (expression1: Expression, expression2: Expression): Expression {

    private var expression1: Expression
    private var expression2: Expression

    init {
        this.expression1 = expression1
        this.expression2 = expression2
    }

    override fun interpret(context: String): Boolean {
        return expression1.interpret(context) || expression2.interpret(context)
    }
}