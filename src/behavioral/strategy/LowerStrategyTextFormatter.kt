package behavioral.strategy

class LowerStrategyTextFormatter: StrategyTextFormatter {
    override fun format(text: String) {
        System.out.println("Texto en Minusculas: " + text.toLowerCase())
    }
}