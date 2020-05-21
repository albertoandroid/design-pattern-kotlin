package structural.adapter

class Adapter(var adaptee: OperationAdaptee): OperationTarget {
    override var getSum: String
        get() = this.adaptee.sum().toString()
        set(value) {}
}