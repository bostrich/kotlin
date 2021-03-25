package com.bostrich.coroutine.higherorder

import org.junit.Test

/***
 * 内联函数：编译的时候会将调用方法的地方自动添加方法对应的代码
 * 在kotlin中使用lambda表达式时一般编译器会直接生成一个匿名内部类， 这样有可能导致的结果就是生成过多的对象
 * 导致运行效率 的低下， kotlin中使用内联函数解决这个问题
 *
 *
 */
class Inline {


    @Test

    fun test(){
        print(alphabet())
    }


    fun alphabet():String{

        val stringBuilder = StringBuilder()
        return with(stringBuilder){
            for(letter in 'A'..'Z'){
                this.append(letter)
            }
            //调用方法默认this
            append("\n now I know the alphabet")
            this.toString()
        }
    }

}

