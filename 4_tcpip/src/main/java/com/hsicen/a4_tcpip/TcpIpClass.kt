package com.hsicen.a4_tcpip

/**
 * 作者：hsicen  2020/4/7 18:21
 * 邮箱：codinghuang@163.com
 * 功能：
 * 描述：Tcp/Ip 协议族   HTTPS的建立过程
 */
class TcpIpClass {

    //TCP/IP 协议族
    /**
     * 概念：一系列协议组成的一个网络分层模型
     * 分层：网络的不稳定性，各层功能独立，模块封装，通用
     *
     * 四层网络分层模型：
     *     应用层(Application Layer)：HTTP，FTP(文件传输)，DNS(网络寻址)
     *     传输层(Transport Layer)：TCP，UDP  数据分块传输策略，数据组装
     *     网络层(Internet Layer)：IP  网络寻址，以包为单位发送网络数据
     *     数据链路层(Link Layer)：以太网，Wi-Fi
     *
     * TCP连接：
     *     什么叫连接：通信双方建立确认可以通信，不会将对方的消息丢弃，即为建立连接
     *     TCP连接的建立：三次握手，第一次(A->B我要给你发消息了)，第二步(B->A好的，我知道了，我也要给你发消息)，第三步(A->B好的，我知道了)
     *     TCP连接的关闭：四次挥手，第一次(A->B我没有消息要给你发了)，第二次(B->A好的，我知道了)，第三次(B->A我没有消息要给你发了)，第四步(A->B好的，我知道了)
     *
     * 长连接：因为移动网络并不在Internet中，而是在运营商的内网汇中，并不具有正真的公网ip；因此，当某个TCP连接在一段时间内不通信后，
     *        网关会出于网络性能考虑而关闭这条TCP连接和公网的连接通道，导致这个TCP端口不能再收到外部通信的消息，即TCP连接被关闭了
     * 长连接的实现：心跳连接，让网关不关闭这条连接
     */


    //HTTPS 连接的建立过程
    /**
     * 定义：HTTP over SSL 的简称，即工作在SSL/TLS 上的HTTP，说白了就是加密通信的HTTP
     * 工作原理：在客户端和服务器之间协商出一套对称密钥，每次发送信息之前先将内容加密，收到之后解密，达到内容的加密传输
     *
     * HTTPS的建立过程：
     *
     */

}