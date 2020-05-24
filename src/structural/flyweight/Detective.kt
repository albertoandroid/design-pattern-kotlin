package structural.flyweight

class Detective: Enemy {

    val LIFE = 1000
    private var weapon = ""

    override fun setWeapon(weapon: String) {
        this.weapon = weapon
        System.out.println("Weapon creado: $weapon")
    }

    override fun lifePoints() {
        System.out.println("La vida de un detective: $LIFE")
    }
}