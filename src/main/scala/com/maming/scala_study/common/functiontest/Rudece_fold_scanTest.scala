package com.maming.scala_study.common.functiontest

/**
reduce、fold、scan函数
一、map方法使每一个元素应用与一元的函数
这Reducing, Folding, and Scanning方法应用于合并操作的二元函数

二、reduceLeft和reduceRight
List(1, 7, 2, 9).reduceLeft(_ - _)
他会让1和7进行运算,结果与2进行计算,以此类推
List(1, 7, 2, 9).reduceRight(_ - _)
他会让2-9,然后7-(2-9),然后1-(7-(2-9))

三、foldLeft
如果开始的时候有一个初始化值,那么就把reduceLeft转换为foldLeft方法
例如
List(1, 7, 2, 9).foldLeft(0)(_ - _)
0 - 1 - 7 - 2 - 9

四、注意事项
初始化的值,和操作是curried形式的参数,所以scala的操作结果返回类型是以初始化函数为准的。
例如List(1, 7, 2, 9).foldLeft("")(_ + _),返回String = 1729

你可以写如下方式:
(0 /: List(1, 7, 2, 9))(_ - _)
/:符号表示假设提醒你形状是一个tree

五、
val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
// Now freq is Map('i' -> 4, 'M' -> 1, 's' -> 4, 'p' -> 2)

与下面的同样效果
(Map[Char, Int]() /: "Mississippi") {
(m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
}

日后本节要重新看一遍,每太看懂

六、scanLeft方法
(1 to 10).scanLeft(0)(_ + _)
yields all partial sums:
Vector(0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55)

 */
class Rudece_fold_scanTest {

  def init() = {

  }

}
