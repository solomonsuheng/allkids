package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;


/**
 * Created by Suheng on 8/7/15.
 */
public class CreateDir {
    public static void main(String[] args) throws IOException {
        String rootPath = "hdfs://172.16.2.215:9000";
        Path p = new Path(rootPath + "/tmp/usr/newDir");
        Configuration conf = new Configuration();

        FileSystem fs = p.getFileSystem(conf);
        boolean b = fs.mkdirs(p);
        System.out.println(b);
        fs.close();

    }
}
