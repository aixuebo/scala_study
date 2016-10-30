package com.maming.scala_study.collection

import scala.collection.mutable

class SetTest {

  def initSet() = {
    val partitionsWithError = new mutable.HashSet[String]
    val partitionMap = new mutable.HashMap[String, Long]
    //partitionsWithError ++= partitionMap.keySet //添加一组map的所有key
    partitionsWithError += "aa"
    partitionsWithError += "bb"

    println(partitionsWithError) //Set(aa, bb)
  }
}
