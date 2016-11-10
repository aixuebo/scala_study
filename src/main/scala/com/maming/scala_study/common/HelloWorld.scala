package com.maming.scala_study.common

import com.maming.scala_study.common.functiontest.FlatMapTest

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

    println(classOf[FlatMapTest].getName) //com.maming.scala_study.common.functiontest.FlatMapTest

    val xx = new String("sss")
    println( xx.asInstanceOf[String])//强制转换成String对象,并且返回该String对象

    println("-----")
    for { (envKey, propKey) <- Seq( ("JAVA_HOME", "aaa"),("MAVEN_HOME1","bbb") )
          value <- Option(System.getenv(envKey))} {
      println(envKey + "==" + value)
    }


  }
}
