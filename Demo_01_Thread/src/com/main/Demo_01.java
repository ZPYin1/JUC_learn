package com.main;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Demo_01 {
    public static void main(String[] args) throws InterruptedException {

        // 获取 cpu 的核数
        // CPU 密集型：IO密集型
        System.out.println(Runtime.getRuntime().availableProcessors());

        Thread.sleep(1000);

        /*
        public enum State {

            // 新生
            NEW,

            // 运行
            RUNNABLE,

            // 阻塞
            BLOCKED,

            // 等待，死等
            WAITING,

            // 超时等待
            TIMED_WAITING,

            // 终止
            TERMINATED;

        }
        */



    }
}
