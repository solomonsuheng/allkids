package ns.handler

import java.net.Socket

/**
 * Created by Suheng on 8/12/15.
 */
class ReciveInfoData(socket: Socket) extends Runnable {
  override def run(): Unit = {
    println(socket.getInetAddress)
    socket.close()
  }
}
