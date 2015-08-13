package akkanotes.messaging.logtest2

import akka.actor.{Actor, ActorLogging}
import akkanotes.messaging.protocols.{TeacherProtocol, StudentProtocol}
import StudentProtocol.QuoteRequest
import TeacherProtocol.QuoteResponse

import scala.util.Random

/**
 * Created by Suheng on 8/12/15.
 */
class TeacherLogActor extends Actor with ActorLogging {

  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try"
  )

  def receive = {
    case QuoteRequest => {
      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))
      log.info(quoteResponse.toString)
    }
  }

  def quoteList = quotes
}
