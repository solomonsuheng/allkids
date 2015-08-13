package akkanotes.messaging.protocols

/**
 * Created by Suheng on 8/12/15.
 */
object StudentProtocol {

  case class QuoteRequest()

  case class QuoteResponse(quoteString: String)

}
