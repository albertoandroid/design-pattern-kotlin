package behavioral.observer

class MessagePublisher: Subject {
    private val observers: MutableList<Observer> = ArrayList()
    override fun attach(o: Observer) {
        observers.add(o)
    }

    override fun detach(o: Observer) {
        observers.remove(o)
    }

    override fun notifyUpdate(trafficLight: TrafficLight) {
        for(o in observers){
            o.update(trafficLight)
        }
    }
}