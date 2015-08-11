package Akka

import akka.actor.Actor

/**
 * Created by Suheng on 8/11/15.
 */
case class ProcessStringMsg(string: String)

case class StringProcessMsg(words: Integer)

class StringCounterActor extends Actor {

  def receive = {
    case ProcessStringMsg(string) => {
      val wordsInLine = string.split(" ").length
      sender ! StringProcessMsg(wordsInLine)
    }
    case _ => println("Error: message not recognized")
  }
}
