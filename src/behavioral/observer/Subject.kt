package behavioral.observer

interface Subject {
    fun attach(o: Observer)
    fun detach(o: Observer)
    fun notifyUpdate(trafficLight: TrafficLight)
}