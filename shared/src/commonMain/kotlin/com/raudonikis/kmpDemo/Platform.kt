package com.raudonikis.kmpDemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform