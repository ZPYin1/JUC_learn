package com.main;

// 基本的买票例子

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 真正的多线程开发，公司开发
 * 线程就是一个单独的资源类，没有任何附属的操作
 * 1.属性、方法
 *
 */
public class SaleTicket02 {

    public static void main(String[] args) {
        // 并发：多线程操作同一个资源类，把资源类丢入线程
        Ticket2 ticket = new Ticket2();


            // @FunctionalInterface 函数式接口，jdk1.8
            new Thread(()->{ for (int i = 0; i < 60; i++) ticket.sale(); },"A").start();
            new Thread(()->{ for (int i = 0; i < 60; i++) ticket.sale(); },"B").start();
            new Thread(()->{ for (int i = 0; i < 60; i++) ticket.sale(); },"C").start();


    }

}

// 资源类 OOP
class Ticket2{
    // 属性、方法
    private int number = 50;

    Lock lock = new ReentrantLock();

    // 卖票的方式
    public void sale(){

        lock.lock(); // 加锁


        try {
            // 业务代码
            if (number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"张票"+"，剩余"+number);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock(); // 解锁
        }
    }
}