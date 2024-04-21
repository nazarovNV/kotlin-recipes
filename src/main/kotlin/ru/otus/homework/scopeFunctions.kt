package ru.otus.homework

import kotlin.random.Random

fun main() {
    val address: Address? = if (Random.nextBoolean()) Address() else null

    address?.run {
        street1 = "Ul. Lenina, d. 10"
        street2 = "Kv. 10"
        city = "Borok"
        country = "Russia"
        index = "12345"
    }

    val addressString = address?.run {
        "$street1, $street2, $city, $country, $index"
    } ?: "Address is not defined"

    println(address)
    println(addressString)
}

class Address {
    lateinit var street1: String
    lateinit var street2: String
    lateinit var city: String
    lateinit var country: String
    lateinit var index: String
}