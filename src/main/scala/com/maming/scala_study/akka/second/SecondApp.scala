package com.maming.scala_study.akka.second

import akka.actor.{Props, ActorSystem}
import com.maming.scala_study.akka.first.TeacherProtocol.InitSignal

/**
 * Created by Lenovo on 2016/10/21.
 */
object SecondApp  extends App{


  //Initialize the ActorSystem
  val actorSystem=ActorSystem("UniversityMessageSystem")

  //construct the Teacher Actor Ref
  val teacherActorRef = actorSystem.actorOf(Props[TeacherActor],"teacher")

  val studentSimulatorAppRef = actorSystem.actorOf(Props(new StudentSimulatorApp(teacherActorRef)), "studentActor")

  studentSimulatorAppRef ! InitSignal

  //Let's wait for a couple of seconds before we shut down the system
  Thread.sleep (5000)

  //Shut down the ActorSystem.
  actorSystem.shutdown()

}
