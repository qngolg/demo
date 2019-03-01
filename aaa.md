
###数据库管理工具：liquibase vs flyway

###curl 模拟 post请求
	
	curl -H "Conetent-Type:application/json" -X POST --data '{}' www.baidu.com


###调用feign客户端失败
hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds 默认时间为1000ms
改大一点就可以了
在低版本中 设置default timeout是不成功的  需要 升级版本 或者针对各个接口进行设置timeout时间

###hystrix默认timeout配置失效的原因
https://taccisum.github.io/zuul_hystrix_default_timeout_config_invalid_reason_research.html


###apollo配置中心  
解决apollo配置修改后  @PostConstruct 中的配置没有更新
https://blog.csdn.net/qq_31289187/article/details/84346529

解决方法：给config.addChangeListener 来对配置进行更新


###groovy 判断对象是否为null 并判断里面的值的时候 
用（obj?obj.getValue:""） == value 
可以用 三目表达式来做


##