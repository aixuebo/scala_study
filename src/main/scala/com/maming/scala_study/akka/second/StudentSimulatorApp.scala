package com.maming.scala_study.akka.second


import akka.actor._
import com.maming.scala_study.akka.first.TeacherProtocol.{InitSignal, QuoteResponse, QuoteRequest}

class StudentSimulatorApp(teacherActorRef:ActorRef) extends Actor with ActorLogging {

  override def preStart() {
    println("StudentSimulatorApp preStart")
  }

  override def postStop() {
    println("StudentSimulatorApp postStop")
  }

  def receive = {
    case QuoteResponse(quoteString) => {
      //仅仅在TeacherActor端打印的,不是回复给StudentSimulatorApp
      println ("aaa==="+quoteString)
    }

    /**

      */
    case InitSignal => {
      println("StudentSimulatorApp start ")
      //send a message to the Teacher Actor
      teacherActorRef!QuoteRequest //发送完了,不用管回复,因此不用阻塞,如果有回复,则会在receive方法里面接收处理
      teacherActorRef.forward(QuoteRequest)//看TeacherActor的打印即可知道forward和!区别
      println("StudentSimulatorApp end ")
    }
  }

}
