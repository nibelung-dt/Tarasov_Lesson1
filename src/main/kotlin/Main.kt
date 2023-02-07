fun main() {
    println("Основные сведения о четырех scope-функциях")
    val list = listOf("Also", "With", "Let", "Apply")
    with(list) {
        println(this[0])
        println(this[1])
        println(this[2])
        println(this[3])
    }

    val let = SсopeFunInfo("let can be used to invoke one or more functions on results of call chains", "it", "Lambda result", "Yes", "Executing a lambda on non-null objects: let; Introducing an expression as a variable in local scope: let")
    val with = SсopeFunInfo("We recommend with for calling functions on the context object without providing the lambda result", "this", "Lambda result", "No", "Grouping function calls on an object: with")
    val apply = SсopeFunInfo("Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object.", "this", "Context object", "Yes", "Object configuration: apply")
    val also = SсopeFunInfo("also is good for performing some actions that take the context object as an argument. Use also for actions that need a reference to the object rather than its properties and functions, or when you don't want to shadow the this reference from an outer scope.", "it", "Context object", "Yes", "Additional effects: also")

    println("Введите also, with, apply или let, чтобы получить описание функции")
    while(true) {
        when(readln()) {
            "let" -> println(let)
            "with" -> println(with)
            "apply" -> println(apply)
            "also" -> println(also)
            "exit" -> break
            else -> println("введите also, with, apply или let")
        }
    }

    fun test() {
        // for commit only
    }

}