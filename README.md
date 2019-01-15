
groovy spock测试框架
[http://spockframework.org/spock/docs/1.0/interaction_based_testing.html]


spring data jpa 
[https://docs.spring.io/spring-data/jpa/docs/current/reference/html/]

querydsl
[http://www.querydsl.com/static/querydsl/latest/reference/html/ch02.html#jpa_integration]


spring framework test 
[https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#spring-testing-annotation-bootstrapwith]


Spring ApplicationEvent Support
[https://docs.spring.io/spring-integration/reference/html/applicationevent.html]


spring4以后 推荐使用 @autowired constructor

```java
public class Exemple{
    
    private final BExemple bExemple;
    
    @Autowired //constructor 注入
    Exemple(BExemple bExemple){
        this.bExemple = bExemple;
    }
    
    
}
class BExmple{}
```



spring integration 
[https://docs.spring.io/spring-integration/reference/html/overview.html]

测试pre-commit mvn test fail


```java
//此处uri上的{cc} 必须和 arg中的参数名完全一致
@RequestMapping("/aa/bb/{cc}")
public String hello(@PathVariable String cc){
    return "";
}
```