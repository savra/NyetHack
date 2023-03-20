package com.hvdbs.nyethack.extensions

fun <T> Iterable<T>.random(): T = this.shuffled().first()