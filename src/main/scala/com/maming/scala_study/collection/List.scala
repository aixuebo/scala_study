package com.maming.scala_study.collection

import scala.collection.mutable

/**
合并List
一个叫做“:::”的方法，可以把两个List连接在一起。

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour // List(1, 2, 3, 4)

还有一个双冒号“::”的方法用来连接一个元素和List，这个元素会在List的最前端：

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree // List(1, 2, 3)
  */
object List {
  
  def main(args: Array[String]) {
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    System.out.println(fruit1);
  }
  
}