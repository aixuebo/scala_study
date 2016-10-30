package com.maming.scala_study.collection

import scala.collection.Map
import scala.collection.parallel.mutable

/**
 * Created by maming on 2016/7/17.
 */
class MapTest {

  def initMap() = {
   /* val consumerThreadIdsPerTopicMap = new mutable.HashMap[String, Set[String]]()
    for ((topic, nConsumers) <- topicCountMap) {
      val consumerSet = new mutable.HashSet[String]
      assert(nConsumers >= 1)
      for (i <- 0 until nConsumers)
        consumerSet += ConsumerThreadId(consumerIdString, i)
      consumerThreadIdsPerTopicMap.put(topic, consumerSet)
    }
    consumerThreadIdsPerTopicMap*/
  }

  def formap(topicCountMap: Map[String,  Int]) = {
    for ((topic, nConsumers) <- topicCountMap) {
      //循环每一个topic有多少个线程

    }
  }
}
