package com.maming.scala_study.akka.second

/**
 * Created by Lenovo on 2016/10/20.
 */

import com.maming.scala_study.akka.first.TeacherProtocol.{QuoteResponse, QuoteRequest}

//import scala.actors.Actor
import akka.actor.{ActorLogging, Actor}
import scala.util.Random


/*
 * Your Teacher Actor class.
 *
 * The class could use refinement by way of
 * using ActorLogging which uses the EventBus of the Actor framework
 * instead of the plain old System out
 *
 */

class TeacherActor extends Actor with ActorLogging {

  override def preStart() {
    println("TeacherActor preStart")
  }

  override def postStop() {
    println("TeacherActor postStop")
  }

  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try")

  def receive = {

    case QuoteRequest => {

      import util.Random

      //Get a random Quote from the list and construct a response
      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))

      //仅仅在TeacherActor端打印的,不是回复给StudentSimulatorApp
      println (quoteResponse)
      sender ! quoteResponse

      /**
       * teacherActorRef!QuoteRequest输出sender:Actor[akka://UniversityMessageSystem/user/studentActor]
       * teacherActorRef.forward(QuoteRequest)输出:sender:Actor[akka://UniversityMessageSystem/deadLetters]
       */
      log.info("sender:"+sender.toString())
      log.info(quoteResponse.toString()+"===")
    }

  }

}