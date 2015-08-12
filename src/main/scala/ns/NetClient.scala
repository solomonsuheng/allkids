package ns

/**
 * Created by Suheng on 8/12/15.
 */
class NetClient extends Runnable {
  override def run(): Unit = {
    while (true) {
      Thread sleep 1000
      println("Client")
    }
  }
}
