package ns

/**
 * Created by Suheng on 8/12/15.
 */
object NetSpeed {
  def main(args: Array[String]): Unit = {
    //启动两个线程，Server和Client
    val netClient = new NetClient
    val netServer = new NetServer
    //开启服务和Client模式
    //    (new Thread(netClient)).start()
    (new Thread(netServer)).start()
  }
}
