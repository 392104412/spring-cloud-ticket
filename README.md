# spring-cloud-ticket
springcloud各组件学习
本项目通过将买票分为购票和出电子票2个环节来搭建springcloud对各个组件，其中搭建的注册中心副本集高可用和提供服务的负载完全可以通过传入不同的active profiles来控制，而不是构建一个相同的项目
- [spring-cloud-buy-ticket-provider](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-buy-ticket-provider)：购票系统服务提供者
- [spring-cloud-eureka](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-eureka)：注册中心
- [spring-cloud-eureka-replicat](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-eureka-replicat)：注册中心的副本集
- [spring-cloud-out-ticket-provider](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-out-ticket-provider)：出票系统服务提供者
- [spring-cloud-ticket-consumer](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-ticket-consumer)：购票消费者
- [spring-cloud-ticket-feign](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-ticket-feign)：声明式服务提供
- [spring-cloud-zuul](https://github.com/392104412/spring-cloud-ticket/edit/master/spring-cloud-zuul)：网关：各主机之间可以通过网关进行各服务调用

spring-cloud各组件简介：http://www.cnblogs.com/alexyangpeng/articles/8592397.html
