package creational.abstractfactory

interface AbstractFactory {
    fun createPayment(): Payment
    fun createMethod(): Method
}