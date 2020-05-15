package creational.builder

class Card private constructor(builder: CardBuilder){

    val cardType: String
    val number: String
    val name: String?
    val experied: Int?
    val isCredit: Boolean?

    init {
        this.cardType = builder.cardType
        this.number = builder.number
        this.name = builder.name
        this.experied = builder.expires
        this.isCredit = builder.credit
    }

    override fun toString(): String {
        return "CARD: $cardType - $number - $experied - $name - $isCredit"
    }


    class CardBuilder(val cardType: String, val number: String){
        var name: String? = null
        var expires: Int = 0
        var credit: Boolean = false

        fun name(name: String): CardBuilder{
            this.name = name
            return this
        }

        fun expires(expires: Int): CardBuilder{
            this.expires = expires
            return this
        }

        fun credit(credit: Boolean?): CardBuilder{
            this.credit = credit!!
            return this
        }

        fun build(): Card{
            return Card(this)
        }
    }
}