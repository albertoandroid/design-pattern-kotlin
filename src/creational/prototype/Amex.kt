package creational.prototype

class Amex: PrototypeCard() {

    init {
        type = "AMEX"
        number = "1111 2222 3333 AMEX"
    }

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Any {
        System.out.println("Clonado Correctamente AMEX")
        return super.clone() as Amex
    }
}