package com.zzaoen.kt

import org.slf4j.Logger
import org.slf4j.LoggerFactory

val log: Logger = LoggerFactory.getLogger("KtCoroutine")

fun logStr(msg: String?) {
    log.info(msg)
}

fun logNumber(msg: Number?) {
    log.info(msg.toString())
}