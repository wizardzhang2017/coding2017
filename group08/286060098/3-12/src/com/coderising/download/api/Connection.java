package com.coderising.download.api;

import java.io.IOException;
import java.net.HttpURLConnection;

public interface Connection {

    /**
     * 构建链接
     * 
     * @param conn
     * @return
     */
    Connection build(HttpURLConnection conn);

    /**
     * 给定开始和结束位置， 读取数据， 返回值是字节数组
     * 
     * @param startPos 开始位置， 从0开始
     * @param endPos 结束位置
     * @return
     */
    byte[] read(int startPos, int endPos) throws IOException;

    /**
     * 得到数据内容的长度
     * 
     * @return
     */
    long getContentLength();

    /**
     * 关闭连接
     */
    void close();

    /**
     * 下载文件名
     */
    String downLoadFileName();
}
