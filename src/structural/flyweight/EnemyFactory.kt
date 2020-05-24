package structural.flyweight

class EnemyFactory {

    companion object{
        private val enemies: HashMap<String, Enemy?> = HashMap()

        fun getEnemy(type: String?): Enemy?{
            var enemy: Enemy? = null
            if(enemies.containsKey(type)){
                enemy = enemies[type]
            }else{
                when(type){
                    "Private" -> {
                        System.out.println("Soldado Creado")
                        enemy = Private()
                    }
                    "Detective" -> {
                        System.out.println("Detective Creado")
                        enemy = Detective()
                    }
                }
                enemies.put(type!!, enemy)
            }
            return enemy
        }
    }
}