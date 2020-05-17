package behavioral.observer

class Car: Observer {
    override fun update(trafficLight: TrafficLight) {
        if(trafficLight.status.equals("RED_CAR")){
            System.out.println("Semaforo Rojo Coche -> Coche NO puede pasar")
        }else{
            System.out.println("Semaforo Verde Coche -> Coche SI puede pasar")
        }
    }

}