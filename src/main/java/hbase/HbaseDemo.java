package hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

/**
 * Created by Suheng on 8/8/15.
 */
public class HbaseDemo {
    public static Configuration configuration;

    static {
        configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum", "172.16.2.217");
        configuration.set("hbase.master", "172.16.2.217:60000");
    }

    public static void main(String[] args) throws IOException {

        HBaseAdmin hBaseAdmin = new HBaseAdmin(configuration);
        if (hBaseAdmin.tableExists("test".getBytes())) {
            System.out.println("exsist");
        }
    }
}
