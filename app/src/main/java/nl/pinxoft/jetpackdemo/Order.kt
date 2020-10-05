package nl.pinxoft.jetpackdemo

import java.time.Instant

data class Order(
    val createdAt: Instant = Instant.now()
)
