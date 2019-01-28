```shell
rabbitMq的机制：

#producer: 消息生产者

#comsumer:消息消费者

```



### Message ack

```shell
rabbitMQ 在发送消息给->comsumer的时候，comsumer会有一个回执，通过回执，删除掉队列里面的消息
#如果不删除队列里面的消息，comsumer重启的时候 会重复消费这些消息
```



#### message durability

```shell
rabbit的服务在重启的时候 也不会丢失消息
```



#### prefetch count

```shell

```

#### Queue

```shell
#队列消息处理
多个消费者可以订阅同一个queue，此时queue的消息会被平均分摊给多个消费者进行处理，而不是每个消费者都收到所有的消息并处理
```

遇到的问题
ObjectMapper转换json对象的时候 出现jsonfield 多的问题
https://blog.csdn.net/wwwasw/article/details/46973109
