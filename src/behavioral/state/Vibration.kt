package behavioral.state

class Vibration: MobileAlertState {
    override fun alert(context: MobileAlertStateContext) {
        System.out.println("La alarma esta vibrando...")
    }
}