package cn.sust.patterns.singleton.demo07;

import java.io.InputStream;

/**
 * Runtime是饿汉式单例模式：不管你用不用对象已经创建好了
 */
public class RuntimeDemo{
    public static void main(String[] args) throws Exception {
        //获得Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //调用exec方法
        Process process = runtime.exec("ipconfig");
        //获取字节输入流对象
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //从字节输入流读取数据
        int len = is.read(arr); //len是读到多少个字节数
        //将读到的数据转换成String对象 打印到控制台
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
