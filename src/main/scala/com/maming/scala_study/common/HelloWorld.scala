package com.maming.scala_study.common

/**
 * Created by Lenovo on 2016/10/11.
 */
object HelloWorld {
  def main(args:Array[String]) = {
    var greeting ="index"
    for(i <- 0 until args.length){
      greeting += (args(i) + " ")
    }
    if(args.length > 0) greeting =greeting.substring(0,greeting.length -1 )

    println(greeting)
  }
}
