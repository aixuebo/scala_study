package com.maming.scala_study.akka.first

/**
 * Created by Lenovo on 2016/10/20.
 */
object TeacherProtocol{
  case class QuoteRequest()
  case class QuoteResponse(quoteString:String)
  case class InitSignal()
}
