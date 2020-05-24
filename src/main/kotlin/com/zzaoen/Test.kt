package com.zzaoen

/* 
 * Author: zzhao3@stuhhub.com
 * Date: 2020/5/21 15:31
 * Desc: 
 */
fun main() {
    // val array = arrayOf("a", "b", "c")
    // var length = array.firstOrNull {
    //     it == "aa"
    // }?.length
    // print(length)
    //
    // var value: String? = "value"
    // value = null
    // length = value?.length
    // print(length)
    
    val list = mutableSetOf<String>("1", "2")
    println(list.joinToString(","))
    
}