package com.maming.scala_study.common.functiontest

/**
 * Created by maming on 2016/7/17.
 */
class MapFunctionTest {

  def mapFunction() = {

    /**
     *1.(1 to 9) 表示循环9次,每次得值都是1-9之间的数字
     *2.每次循环都调用一个方法,就是map里面具体的方法内容
     *3.将最终结果进行输出
     *
     * 即map方法是一个集合作为参数,返回的结果还是一个集合,只是每一个map函数对一个元素进行处理,处理的结果还是一个元素,被返回而已
     */
    (1 to 9).map("*" * _).foreach(println _)
  }
}
