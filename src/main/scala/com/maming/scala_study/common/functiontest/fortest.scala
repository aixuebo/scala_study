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
}
