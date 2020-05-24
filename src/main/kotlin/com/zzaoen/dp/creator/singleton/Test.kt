package com.zzaoen.dp.creator.singleton

import com.zzaoen.kt.logStr

/* 
 * Author: zzhao3@stuhhub.com
 * Date: 2020/3/12 20:11
 * Desc: 
 */

fun main() {
  // instance is a companion object, so DPSingleton needn't initialize
  // companion is a inner static final class,
  // DPSingleton.instance = DPSingleton.Companion.getInstance()
  val dpSingleton1 = DPSingleton.instance
  val dpSingleton2 = DPSingleton.instance
  
  logStr(dpSingleton1.toString())
  logStr(dpSingleton2.toString())
  
  // object has a static INSTANCE variable, DPObjectSingleton means
  // DPObjectSingleton.INSTANCE
  val dpSingleton3 = DPObjectSingleton
  val dpSingleton4 = DPObjectSingleton
  logStr(dpSingleton3.toString())
  logStr(dpSingleton4.toString())
  
  val dpNotSingleton1 = DPNotSingleton()
  val dpNotSingleton2 = DPNotSingleton()
  logStr(dpNotSingleton1.toString())
  logStr(dpNotSingleton2.toString())
  
}
