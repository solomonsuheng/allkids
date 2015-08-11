package zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Created by Suheng on 8/10/15.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ZooKeeper zkp = new ZooKeeper("172.16.2.216:2181", 3000, null);
        System.out.println(zkp.getState());
        try {
            if (zkp.exists("/node1", false) != null) {
                System.out.println("node1 exists now");
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
