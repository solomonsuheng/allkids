package akkanotes.messaging.actormsg1

import akka.actor.{ActorSystem, Props}
import akkanotes.messaging.logtest2.TeacherLogActor
import akkanotes.messaging.protocols.StudentProtocol.QuoteRequest

/**
 * Created by Suheng on 8/12/15.
 */
object StudentSimulator {
  def main(args: Array[String]) {
    val actorSystem = ActorSystem("UniversityMessageSystem")
    val teacherActorRef = actorSystem.actorOf(Props[TeacherLogActor])
    teacherActorRef ! QuoteRequest
  }
}
