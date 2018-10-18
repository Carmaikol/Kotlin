
fun main(args: Array<String>) {
    val nameToAges = mapOf(Pair("Peter",24),Pair("Roger",42))
    val nameToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 42
    )

    println(nameToAges == nameToAges2)

    println(nameToAges.keys)
    println(nameToAges.values)
    println(nameToAges.entries)


    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_00_000,
            "USA" to 300_000_000
    )

    countryToInhabitants.put("Australia",23_000_000)
    countryToInhabitants.put("USA",320_000_000)

    println(countryToInhabitants)


    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("France"))
    println(countryToInhabitants.containsValue(20_000_000))


    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France",0))


    nameToAges.entries.forEach {
        it
        println("${it.key} is ${it.value} years old")
    }


}