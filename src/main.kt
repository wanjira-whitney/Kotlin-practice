fun main (){
    statement()
    test()
    array()
    things()

}
fun statement(){
    var name = "kimmyworld"
    if(name=="kimmyworld"){
        println("That's me!")
    }
    else println("I don't know who that is!")
}
fun test() {
    var gender = "Female"
    if (gender == "Female"){
    println("True")
    }
    else println("False")
}
fun array() {
    var numbers = arrayOf(21, 32, 475, 8, 92, 1, 54)
    var sum = numbers[0]+numbers[2]
    println(sum)

}
fun things() {
    var names = arrayOf("Abby", "Brenda", "Carol", "Diana", "Esther", "Flo")
    println(names.indexOf("Diana"))
}

