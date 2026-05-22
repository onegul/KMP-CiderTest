package co.gul.cidertest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform