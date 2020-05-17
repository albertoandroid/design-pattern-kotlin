package behavioral.state

class MobileAlertStateContext(var currentState: MobileAlertState = Sound()) {

    fun setState(state: MobileAlertState){
        currentState = state
    }

    fun alert(){
        currentState.alert(this)
    }
}