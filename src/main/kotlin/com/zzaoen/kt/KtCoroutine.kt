package com.zzaoen.kt

/* 
 * Author: zzhao3@stuhhub.com
 * Date: 2020/3/10 20:58
 * Desc: 
 */
import kotlinx.coroutines.*
import kotlinx.coroutines.launch
fun main() {
  logStr("Start")
  
  // Start a coroutine
  GlobalScope.launch {
    delay(1000)
    log.info("Hello")
  }
  
  Thread.sleep(2000) // wait for 2 seconds
  log.info("Stop")
}
