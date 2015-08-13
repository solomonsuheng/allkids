package ns

import java.net.ServerSocket

import ns.context.ServerContext
import ns.handler.ReciveInfoData

/**
 * Created by Suheng on 8/12/15.
 */
class NetServer extends Runnable {
  //NetServerContext
  val serverContext = new ServerContext

  override def run(): Unit = {
    val serverSocket = new ServerSocket(12345)
    while (true) {
      val server = serverSocket.accept()
      new Thread(new ReciveInfoData(server)).start()
    }
  }
}
