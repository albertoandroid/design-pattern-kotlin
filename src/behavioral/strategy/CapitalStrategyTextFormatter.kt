package behavioral.strategy

class CapitalStrategyTextFormatter: StrategyTextFormatter {
    override fun format(text: String) {
        System.out.println("Texto en Mayusculas: " + text.toUpperCase())
    }
}