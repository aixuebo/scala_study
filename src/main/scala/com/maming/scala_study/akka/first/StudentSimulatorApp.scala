package com.maming.scala_study.akka.first


import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala
import com.maming.scala_study.akka.first.TeacherProtocol.{QuoteResponse, QuoteRequest}

object StudentSimulatorApp extends App{

  //Initialize the ActorSystem
  val actorSystem=ActorSystem("UniversityMessageSystem")

  //construct the Teacher Actor Ref
  val teacherActorRef=actorSystem.actorOf(Props[TeacherActor])

  println("StudentSimulatorApp start ")

  //send a message to the Teacher Actor
  teacherActorRef!QuoteRequest

  println("StudentSimulatorApp end ")
  //Let's wait for a couple of seconds before we shut down the system
  Thread.sleep (2000)

  //Shut down the ActorSystem.
  actorSystem.shutdown()


}
