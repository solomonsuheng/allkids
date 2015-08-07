package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.*;

/**
 * Created by Suheng on 8/7/15.
 */
public class UploadFile {
    public static void main(String[] args) throws IOException {
        String rootPath = "hdfs://172.16.2.215:9000";
        Configuration conf = new Configuration();
        String localFile = "/Users/gesuheng/WorkSpace/transwarpProject/myOwnKoalas/pom.xml";
        InputStream in = new BufferedInputStream(new FileInputStream(localFile));

        Path p = new Path(rootPath + "/tmp/pom.xml");
        FileSystem fs = p.getFileSystem(conf);
        OutputStream out = fs.create(p);

        IOUtils.copyBytes(in, out, conf);

        fs.close();
        IOUtils.closeStream(in);
    }
}
