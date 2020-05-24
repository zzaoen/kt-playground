package com.zzaoen.kt

import kotlinx.coroutines.Job

/* 
 * Author: zzhao3@stuhhub.com
 * Date: 2020/3/24 19:19
 * Desc: 
 */
 
class ExampleCoroutineImp: IExampleCoroutine {
  override val job = Job()
}

suspend fun main() {
  // val imp = ExampleCoroutineImp()
  // imp.exampleCoroutineScope()
  //
  // // Do something else, then the job in exampleCoroutineScope will finish
  // Thread.sleep(2000)
  
  val example = ExampleCoroutine()
  val exampleCoroutineScope = example.exampleCoroutineScope()
  Thread.sleep(2000)
  
}