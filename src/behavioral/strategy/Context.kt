package behavioral.strategy

class Context(var strategyTextFormatter: StrategyTextFormatter) {
    fun publishText(text: String){
        strategyTextFormatter.format(text)
    }
}