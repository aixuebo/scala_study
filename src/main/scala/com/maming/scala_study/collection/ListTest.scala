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

scala> l.count(s => s.length == 3)
res1: Int = 2
返回去掉l头两个元素的新列表


判断l是否存在某个元素
scala> l.exists(s => s == "Hah")
res7: Boolean = true
滤出长度为3的元素

scala> l.filter(s => s.length == 3)
res8: List[String] = List(Hah, WOW)
判断所有元素是否以“H”打头

scala> l.forall(s => s.startsWith("H"))
res10: Boolean = false
判断所有元素是否以“H”结尾

scala> l.forall(s => s.endsWith("W"))
res11: Boolean = false
打印每个元素

scala> l.foreach(s => print(s + ' '))
Hello Hi Hah WOW WOOW
取出第一个元素


scala> l.map(s => {val s1 = s + " - 01"; s1.reverse})
res29: List[String] = List(10 - olleH, 10 - iH, 10 - haH, 10 - WOW, 10 - WOOW)
生成用逗号隔开的字符串

scala> l.sortWith(_.compareTo(_) < 0)
res48: List[String] = List(Hah, Hello, Hi, WOOW, WOW)

  */
object ListTest {

  def createTest() = {
    val l = Nil;
    System.out.println(l); //List()
    val l2 = List()
    System.out.println(l2); //List()
  }

  def addTest1() = {

    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    System.out.println(days); //List(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday)

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    System.out.println(fruit1);//List(apples, oranges, pears)

    //用字符串创建列表
    val l = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
    System.out.println(l);//List(Hello, Hi, Hah, WOW, WOOW)

    //用“:::”叠加创建新列表
    val wow = l ::: List("WOOOW", "WOOOOW")
    System.out.println(wow);//List(Hello, Hi, Hah, WOW, WOOW, WOOOW, WOOOOW)


  }

  def getTest() = {
    //通过索引获取列表值
    val l = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
    System.out.println(l(3));//WOW

    System.out.println(l.head);//Hello
    System.out.println(l.last);//WOOW

  }

  /**

   */
  def delTest() = {
    val l = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
    l.drop(2)
    System.out.println(l.drop(2));//List(Hah, WOW, WOOW)
    System.out.println(l.dropRight(2));//List(Hello, Hi, Hah)
    System.out.println(l);//List(Hello, Hi, Hah, WOW, WOOW)

    System.out.println(l.init);//List(Hello, Hi, Hah, WOW)  剔除最后一个元素，生成新列表
    System.out.println(l.tail);//List(Hi, Hah, WOW, WOOW) 剔除第一个元素，生成新列表
  }

  def toStringTest() = {
    val l = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
    System.out.println(l.mkString(", "));//Hello, Hi, Hah, WOW, WOOW
    System.out.println(l.reverse);//List(WOOW, WOW, Hah, Hi, Hello)
  }


  def main(args: Array[String]) {
    ListTest.createTest();
    ListTest.addTest1();
    ListTest.getTest();
    ListTest.delTest();
    ListTest.toStringTest();
  }

}