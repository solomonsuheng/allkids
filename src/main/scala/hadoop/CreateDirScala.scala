package hadoop

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path

/**
 * Created by Suheng on 8/7/15.
 */
object CreateDirScala {
  def main(args: Array[String]) {
    val rootPath = "hdfs://172.16.2.215:9000"
    val p = new Path(rootPath + "/tmp/scalaTest")
    val conf = new Configuration()

    val fs = p.getFileSystem(conf)

    val b = fs.mkdirs(p)
    println(b)
    fs.close()
  }
}
