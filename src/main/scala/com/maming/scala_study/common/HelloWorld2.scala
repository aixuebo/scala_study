package com.maming.scala_study.common

import scala.collection.mutable

/**
 * Created by Lenovo on 2016/10/11.
 */
object HelloWorld2 extends App{
  println("Hello， World!")

  var preferredLocation: Option[String] =  Option("hello")

  val initialHash = mutable.Set[String]()

  val rnd = new scala.util.Random(7919)

  def xxx = {
    println("Hello， Worls")
    //println(preferredLocation.exists("hello".equals("hello")))
    //println(preferredLocation.exists(false))

    initialHash+="aa"
    initialHash+="bb"


    for ((rdd, rddIndex) <- initialHash.zipWithIndex) {
      println(rdd+"==="+rddIndex)
    }

    println(initialHash)

    println(rnd.nextInt())
    println(rnd.nextInt())


  }

  xxx;
}
