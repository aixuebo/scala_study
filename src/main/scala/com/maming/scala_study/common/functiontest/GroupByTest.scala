package com.maming.scala_study.common.functiontest

/**
 *  requestInfo: Map[TopicAndPartition, PartitionFetchInfo]
 *  val requestInfoGroupedByTopic = requestInfo.groupBy(_._1.topic) 表示按照requestInfo._1.topic分组,即按照TopicAndPartition的topic分组
 *
 *  返回值
 *  Map[String, Map[TopicAndPartition, PartitionFetchInfo]] key是topic,value中key表示抓取哪个topic-partition数据,value表示从offset开始抓取,抓取多少个数据返回
 *  我们可以看到,返回值还是Map[TopicAndPartition, PartitionFetchInfo],只不过前面多了一个包装Map,原来的值变成value了,包装的就是topic
 *  可以理解成原来的requestInfo: Map[TopicAndPartition, PartitionFetchInfo] 每一个元素TopicAndPartition, PartitionFetchInfo都是一条记录
 *  现在进行group by处理,返回每个分组下的记录,该分组下的记录依然是一个Map
 */
class GroupByTest {


  def groupByTest1() = {

  }

  def groupByTest2() = {

    /**
    var dataGroupedByTopic = Map[String,Map[TopicAndPartition, FetchResponsePartitionData]]
    //1.dataGroupedByTopic.toList 表示对map进行转换成list,好方便调用list的map方法,对每一个元素进行处理
    //2.因此list的每一个元素就是String,Map[TopicAndPartition, FetchResponsePartitionData]
    //3.对每一个元素进行map处理
    //4.因此case(topic, data) 就代表字符串的topic和data是Map[TopicAndPartition, FetchResponsePartitionData]
    //5.因此可以组装成TopicDataSend对象
    dataGroupedByTopic.toList.map {
    case(topic, data) => new TopicDataSend(TopicData(topic,
                                                     data.map{case(topicAndPartition, message) => (topicAndPartition.partition, message)}))
     */

  }
}
