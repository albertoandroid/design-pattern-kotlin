package behavioral.observer

class Pedestrian: Observer {
    override fun update(trafficLight: TrafficLight) {
        if(trafficLight.status.equals("RED_CAR")){
            System.out.println("Semaforo Verde para Peaton -> Peaton SI puede pasar")
        }else{
            System.out.println("Semaforo Rojo para Peaton -> Peaton NO puede pasar")
        }
    }
}