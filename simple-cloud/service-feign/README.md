feign本身已经整合了ribbon，已经实现了负载均衡的效果。
同时也整合了hystrix，具有熔断能力。

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
三个注解来打开feign

通过对service增加@FeignClient(value = "server-client-test")来进行映射

通过@FeignClient(value = "server-client-test",fallback = SchedulServiceHiHystrix.class)来实现断路器