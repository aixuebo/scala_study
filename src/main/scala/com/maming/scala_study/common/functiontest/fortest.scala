package com.maming.scala_study.common.functiontest

import java.util.concurrent.LinkedBlockingQueue

/**
 * Created by maming on 2016/7/17.
 */
class fortest {


  private val numStreams = 7;//定义7个流

  /**
   * 1.循环numStreams次返回,每次产生一个元组([],Int)
   * 2.将所有的元组组成List集合被返回
   * List(([],1), ([],2), ([],3), ([],4), ([],5), ([],6), ([],7))
   */
  private val wildcardQueuesAndStreams = (1 to numStreams)
    .map(e => {
    val queue = new LinkedBlockingQueue[String](10)
    val stream = e;
    (queue, stream)
  }).toList

  def arrayfor(): Unit = {
    println(wildcardQueuesAndStreams)
  }

  /**
  var wildcardTopics =
      getChildrenParentMayNotExist(zkClient, BrokerTopicsPath)
        .filter(topic => topicFilter.isTopicAllowed(topic, config.excludeInternalTopics))
   */
  def filterTest( list: Seq[String]):Unit = {
   var wildcardTopics = list.filter(topic => booleanTest(topic));
   println(wildcardTopics)
  }

  def booleanTest(topic:String):Boolean = {
    if(topic.startsWith("pre")){
      return true;
    }
    return false;
  }

  //打印preaa和prebb
  def filterTest1() = {
    val lst =  Seq("aa","preaa","prebb")
    println(lst)
    filterTest(lst);
  }


  //循环5次
  def fortest() = {
    for (i <- 0 until 5){

    }
  }

  var myArray : Array[String] = new Array[String](10);
  for(value : String <- myArray if value.endsWith("5")) {
    println(value);
  }

  //scala的for语句中支持多个if条件，多个if之间用;来分割,如下例子,多个if条件必须同时满足，才会执行for语句块内的代码
  for(value : String <- myArray
      if value.endsWith("5");
      if value.indexOf("value") != -1 ) {
    println(value);
  }

  for (i <- 1 to 3; j <- 1 to 3) print ((10 * i +j) + " ") // 将打印 11 12 13 21 22 23 31 32 33

  //从seq中循环两组key-value,然后去System.getenv中查找该key对应的值,如果找到了,则打印,找不到的忽略
  println("---")
  for { (envKey, propKey) <- Seq( ("JAVA_HOME", "aaa"),("MAVEN_HOME","bbb") )
        value <- Option(System.getenv(envKey)).orElse(Option(System.getProperty(propKey)))} {
    println(envKey + "==" + value)
  }

}
