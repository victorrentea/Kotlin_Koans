class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++

        return this
    }
}

fun invokeTwice(invokable: Invokable) =
        invokable()()

fun main() {
    val c = CURry()
    println(c()()())

    val i = Invokable()
    i()()()()()
    println(i.numberOfInvocations)
}

class CURry {
    operator fun invoke(): Curry2 = Curry2()
}
class Curry2 {
    operator fun invoke(): Curry3 = Curry3()
}

class Curry3 {
    operator fun invoke() = "Pilaf"
}

