package structural.adapter

class OperationAdaptee(var a: Int, var b: Int) {

    fun sum(): Int{
        return a + b
    }
}