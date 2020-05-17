package behavioral.state

class Sound: MobileAlertState {
    override fun alert(context: MobileAlertStateContext) {
        System.out.println("La alarma esta sonando...")
    }
}