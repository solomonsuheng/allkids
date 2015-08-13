package ns.context

import java.util

/**
 * Created by Suheng on 8/12/15.
 */
/**
 * 仓库类Storage实现缓冲区
 */
class Storage {

  //仓库中最大存储量
  val MAX_SIZE = 1

  //仓库存储的载体
  val list = new util.LinkedList[Object]()

  //生产num个产品
  def produce() {

    //同步代码段
    synchronized {
      while (list.size() + 1 > MAX_SIZE) {
        println("Full")
        wait()
      }
      list.add(new Object)
      println("Add done")
      notifyAll()
    }
  }

  def consume() {
    synchronized {
      while (list.size == 0) {
        println("None")
        wait()
      }

      list.remove()
      notifyAll()
    }
  }
}

class Producer(storage: Storage) extends Thread {
  val s = storage

  override def run(): Unit = {
    while (true) {
      Thread sleep (1000)
      storage.produce()
    }
  }

}

class Consumer(storage: Storage) extends Thread {
  val s = storage

  override def run(): Unit = {
    while (true) {

      storage.consume()
    }
  }
}

object TT {
  def main(args: Array[String]) {
    val s = new Storage
    val p1 = new Producer(s)
    val c1 = new Consumer(s)
    p1.start()
    c1.start()
  }
}
