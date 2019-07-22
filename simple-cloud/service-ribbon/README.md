ribbon负载均衡。

@EnableHystrix 来打开断路器
为接口增加@HystrixCommand(fallbackMethod = "hiError")，当接口访问不通畅时，将调用错误回调方法。
