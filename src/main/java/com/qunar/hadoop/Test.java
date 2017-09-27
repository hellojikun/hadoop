package com.qunar.hadoop;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


import java.net.URI;

public class Test {
    private static String ADDRESS = "hdfs://47.95.112.96:9000/";
    public static void main(String[] args) throws Exception {
        String uri = ADDRESS;
        Configuration config = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri), config);
        FileStatus[] statuses = fs.listStatus(new Path("/user/kun.ji/hadoop"));
        for (FileStatus status : statuses) {
            System.out.println(status);
        }
    }
}