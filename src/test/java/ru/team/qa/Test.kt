package ru.team.qa

import java.util.*

class Test {
    fun foo(name: String, number: Int, toUpperCase: Boolean): String? {
        return (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number
    }

    fun foo(name: String, number: Int): String? {
        return foo(name, number, false)
    }

    fun foo(name: String, toUpperCase: Boolean): String? {
        return foo(name, 42, toUpperCase)
    }

    fun foo(name: String): String? {
        return foo(name, 42)
    }
}