package com.bostrich.coroutine.higherorder

import org.junit.Test

/***
 * 高阶函数的使用
 * 定义：高阶函数是一个将另一个方法作为参数或者返回值的一个方法
 *
 *
 *
 */
class HigherOrder {

    @Test
    fun test(){
        //将 lambda 存储到一个变量中去
        val sum = {x:Int, y:Int -> x + y }
        val action = {print("42")}

        twoAndThree(sum)
    }
//    将lambda作为参数传入
    private fun twoAndThree(operator:(Int, Int) -> Int){
        val result = operator(2, 3)
        println("result is $result")
    }




}