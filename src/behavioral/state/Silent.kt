package behavioral.state

class Silent: MobileAlertState {
    override fun alert(context: MobileAlertStateContext) {
        System.out.println("La alarma esta en modo silencioso...")
    }
}