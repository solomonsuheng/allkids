package Akka

import akka.actor.{ActorSystem, Props}

/**
 * Created by Suheng on 8/11/15.
 */
object Sample {
  def main(args: Array[String]) {
    import akka.dispatch.ExecutionContexts._
    import akka.util.Timeout

    import scala.concurrent.duration._
    implicit val ec = global

    val system = ActorSystem("System")
    val actor = system.actorOf(Props(new WordCounterActor("/Users/gesuheng/Desktop/hehe.java")))
    implicit val timeout = Timeout(25 seconds)
  }
}
