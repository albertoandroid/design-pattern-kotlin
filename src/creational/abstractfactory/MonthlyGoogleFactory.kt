package creational.abstractfactory

class MonthlyGoogleFactory: AbstractFactory {
    override fun createPayment(): Payment {
        return GooglePayment();
    }

    override fun createMethod(): Method {
        return MontlyMethod()
    }
}