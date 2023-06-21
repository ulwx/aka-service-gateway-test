package com.example.gateway;

public class Test {
    public static void main(String[] args) throws Exception{
//        Mono.just("12234").map(t->{
//            return t;
//            //throw new RuntimeException("abcddddddd");
//        }).doOnTerminate(()->{
//               System.out.println("yyyyyyy");
//       })
//       .subscribe(t->{
//            System.out.println(t+":subscribe");
//        },(t)->{
//           System.out.println(":66666");
//       },()->{
//           System.out.println(":789");
//       });
//
//        int i=0;

//        ConnectableFlux<Long> hotFlux =(ConnectableFlux) Flux.interval(Duration.ofSeconds(1)).publish();
//
//        hotFlux.subscribe(i -> System.out.println("Subscriber 1: " + i));
//        hotFlux.connect();
//        Thread.sleep(3000);
//
//        hotFlux.subscribe(i -> System.out.println("Subscriber 2: " + i));
//        Thread.sleep(3000);

//        NettyDataBufferFactory bufferFactory = new NettyDataBufferFactory(PooledByteBufAllocator.DEFAULT);
//        DataBuffer buffer = bufferFactory.allocateBuffer();
//
//        DataBufferUtils.release(buffer);
//        DataBufferUtils.release(buffer);
//        int i=0;

//        Flux<Integer> flux=Flux.range(1, 1000)
//                .subscribeOn()
//                .publishOn(Schedulers.parallel())
//                .map(i -> {
//                    System.out.println("Mapping: " + i + " - Thread: " + Thread.currentThread().getName());
//                    return i * 2;
//                })
//                ;
//        flux.subscribe(System.out::println);
//        flux.subscribe((t)->{
//            System.out.println(t+":2");
//        });
//
//        Thread.sleep(20000); // Wait for the stream to complete
//        Flux<String> flux=Flux.just("tom","abc")
//                .map(s -> {
//                    System.out.println("[map] Thread name: " + Thread.currentThread().getName());
//                    return s.concat("@mail.com");
//                })
//                //.publishOn(Schedulers.newElastic("thread-publishOn"))
//                .filter(s -> {
//                    System.out.println("[filter] Thread name: " + Thread.currentThread().getName());
//                    return s.startsWith("t");
//                })
//                .subscribeOn(Schedulers.parallel())
//                ;
//
//              flux.subscribe(s -> {
//                    System.out.println("[subscribe] Thread name: " + Thread.currentThread().getName());
//                    System.out.println(s);
//                });
//        Flux.just("abcd", "ffzs")
//                .flatMap(i -> Flux.fromArray(i.split("")).delayElements(Duration.ofMillis(10)))
//                .subscribe(i -> System.out.print("->"+i));
//        Thread.sleep(100000);

    }
}
