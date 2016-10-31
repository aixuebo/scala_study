package com.maming.scala_study.common.functiontest

/**
一、该方法是将两个集合关联起来
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)
prices zip quantities
返回值List[(Double, Int)] = List((5.0, 10), (20.0, 2), (9.95, 1))
二、zip结果应用于map
(prices zip quantities) map { p => p._1 * p._2 } //使用p._1表示cuple的第一个元素
返回值List(50.0, 40.0, 9.95)
三、如果两个集合的元素数量不一致,则以集合最小的数量为准
List(5.0, 20.0, 9.95) zip List(10, 2)
返回值 List((5.0, 10), (20.0, 2))
四.zipAll方法,可以有默认值,让短的集合用默认值代替
List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
返回值List((5.0, 10), (20.0, 2), (9.95, 1))
五.zipWithIndex
"Scala".zipWithIndex
Vector(('S', 0), ('c', 1), ('a', 2), ('l', 3), ('a', 4))
"Scala".zipWithIndex.max 返回最大的元素是('l', 3)
"Scala".zipWithIndex.max._2 获取返回值是3
 */
class ZippingTest {

  def init() = {

  }

}
