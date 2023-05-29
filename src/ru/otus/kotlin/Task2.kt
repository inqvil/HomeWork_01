data class Person(val name: String, val surname:String, val age: Int)

fun List<Person>.sortByAgeDescending(): List<Person>{
    return this.sortedByDescending { it.age }
}
fun List<Person>.sortByName(): List<Person>{
    return this.sortedWith(compareBy<Person> { person -> person.name}.thenBy { person -> person.surname })
}

fun main() {
    val list = listOf<Person>(
        Person("Иван", "Петров", 33),
        Person("Иван", "Алексеев", 20),
        Person("Анна", "Каренина", 25)
    )

    println(list.sortByName())
    println(list.sortByAgeDescending())

}
