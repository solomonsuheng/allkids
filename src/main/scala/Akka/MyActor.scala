package Akka

import akka.actor.{Actor, ActorSystem, Props}
import akka.event.Logging

/**
 * Created by Suheng on 8/11/15.
 */
class MyActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case "test" => log.info("received test")
    case _ => log.info("received unknown message")
  }
}

object MyActor {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val myActor = system.actorOf(Props[MyActor], "H")

  }
}
