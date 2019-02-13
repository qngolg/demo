
###数据库管理工具：liquibase vs flyway

###curl 模拟 post请求
	
	curl -H "Conetent-Type:application/json" -X POST --data '{}' www.baidu.com


###调用feign客户端失败
hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds 默认时间为1000ms
改大一点就可以了
在低版本中 设置default timeout是不成功的  需要 升级版本 或者针对各个接口进行设置timeout时间

###hystrix默认timeout配置失效的原因
https://taccisum.github.io/zuul_hystrix_default_timeout_config_invalid_reason_research.html