package ns

/**
 * Created by Suheng on 8/12/15.
 */
class NetServer extends Runnable {
  override def run(): Unit = {
    while (true) {
      Thread sleep 2000
      println("Server")
    }
  }
}
