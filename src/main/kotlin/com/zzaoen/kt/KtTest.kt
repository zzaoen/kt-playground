package com.zzaoen.kt

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/* 
 * Author: zzhao3@stuhhub.com
 * Date: 2020/5/8 08:34
 * Desc: 
 */
// class KtTest {
//   suspend fun main() = coroutineScope {
//     launch {
//       delay(1000)
//       println("Kotlin Coroutines World!")
//     }
//     println("Hello")
//   }
// }

// fun main() {
//   GlobalScope.launch {
//     delay(1000)
//     println("ok")
//   }
//   println("Hello")
// }

suspend fun main() = coroutineScope {
  launch {
    delay(1000)
    println("Kotlin Coroutines World!")
  }
  println("After")
}

