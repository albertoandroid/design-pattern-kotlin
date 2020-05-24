package structural.flyweight

class Private: Enemy {

    val LIFE = 200
    private var weapon = ""

    override fun setWeapon(weapon: String) {
        this.weapon = weapon
        System.out.println("Weapon creado: $weapon")
    }

    override fun lifePoints() {
        System.out.println("La vida de un soldado: $LIFE")
    }
}