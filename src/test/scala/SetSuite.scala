import Demo.scala
import org.scalatest.{FunSuite, Matchers}

/**
 * Created by Suheng on 8/5/15.
 */
class SetSuite extends FunSuite with Matchers {
  test("message doesn't start with Hesllo") {
    (new scala).message should startWith("Hesllo")
  }
}
