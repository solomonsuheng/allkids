package ns

import java.io.{InputStreamReader, LineNumberReader}

/**
 * Created by Suheng on 8/12/15.
 */
object NetSpeed {
  def main(args: Array[String]): Unit = {
    //启动两个线程，Server和Client
    //    val netClient = new NetClient
    //    val netServer = new NetServer
    //    (new Thread(netClient)).start()
    //    (new Thread(netServer)).start()
    //    executeShell("./kk.sh")
    Runtime.getRuntime.exec("./server.sh")
    Runtime.getRuntime.exec("./client.sh")

  }

  def executeShell(cmd: String) = {
    val process = Runtime.getRuntime.exec(cmd)
    val issuccess = process.waitFor()


    val br = new LineNumberReader(new InputStreamReader(process.getInputStream))
    val sb = new StringBuffer()
    var continue = true

    while (continue) {
      val line = br.readLine()
      val option = Option(line)
      option match {
        case Some(x) => sb.append(line + "\n")
        case _ => continue = false
      }
    }
    println(sb.toString)
  }

}
