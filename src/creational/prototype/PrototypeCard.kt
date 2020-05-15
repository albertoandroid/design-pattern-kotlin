package creational.prototype

abstract class PrototypeCard: Cloneable {

    var number: String
    var type: String

    init {
        number = "0000 0000 0000 0000"
        type = ""
    }

    fun getCard(){
        System.out.println(number)
    }

    @Throws(CloneNotSupportedException::class)
    override fun clone(): Any {
        System.out.println("PrototypeCard Clonado Perfectamente")
        return super.clone() as PrototypeCard
    }
}