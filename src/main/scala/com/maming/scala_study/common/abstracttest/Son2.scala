package com.maming.scala_study.common.abstracttest

/**
 * Created by Lenovo on 2016/11/10.
 */
class Son2 extends Father{
  override def aa() = {
    println("Son2 aa")
  }

  def cc() = {
    println("Son2 1 cc")
  }

}

object Son2Test {
  def main(args:Array[String]) = {

    var father = new Son1();
    father.aa();

    father.asInstanceOf[Son1].aa();
    father.asInstanceOf[Son2].aa();

  }
}
