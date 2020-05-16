package behavioral.command

class CreditCardReceiver {

    fun sendPINNumberToCustomer(){
        System.out.println("El PIN number ha sido enviado al cleinte")
    }

    fun sendSMSToCustomerActivate(){
        System.out.println("Enviado SMS al cliente informando de activación")
    }

    fun activate(){
        System.out.println("La tarjeta ha sido activada")
    }

    fun desactivate(){
        System.out.println("La tarjeta ha sido desactivada")
    }

    fun sendSMSToCustomerDesactivate(){
        System.out.println("Enviado SMS al cleinte informando de desactivation")
    }
}