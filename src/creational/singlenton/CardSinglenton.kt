package creational.singlenton

object CardSinglenton {

    var cardNumber: String

    init {
        cardNumber = "0000 0000 0000 0000"
        System.out.println("Initializing with object: $this")
        System.out.println("Singlenton class invoked")
    }

    fun doSomething(){
        System.out.println("Trabajando nuestra instancia singlenton")
    }
}