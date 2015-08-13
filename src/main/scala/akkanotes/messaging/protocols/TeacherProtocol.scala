package akkanotes.messaging.protocols

/**
 * Created by Suheng on 8/12/15.
 */
object TeacherProtocol {

  case class QuoteRequest()

  case class QuoteResponse(quoteString: String)

}
