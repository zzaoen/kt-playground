package com.zzaoen.dp.creator.singleton

import com.zzaoen.kt.log
import com.zzaoen.kt.logStr

/* 
 * Author: zzaoen
 * Date: 2020/3/12 20:03
 * Desc: Singleton design pattern implementation
 */
class DPSingleton private constructor() {
  // private object HOLDER {
  //   val INSTANCE = DPSingleton()
  // }
  
  companion object {
    // lazy indicates it will be computed on the first access only. It'synchronized, the value
    // is computed only in one thread, and all threads will see the same value.
    val instance: DPSingleton by lazy { DPSingleton() }
  }
}

object DPObjectSingleton

class DPNotSingleton