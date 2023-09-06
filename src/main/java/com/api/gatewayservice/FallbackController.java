package com.api.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FallbackController {

    @GetMapping("/orderServiceFallback")
    public Flux<String> contactServiceFallback() {
        return Flux.just("order service is down at this time !!");
    }

    @GetMapping("/paymentServiceFallback")
    public Flux<String> paymentServiceFallback() {
        return Flux.just("payment service is down at this time !!");
    }

    @GetMapping("/inventoryServiceFallback")
    public Flux<String> inventoryServiceFallback() {
        return Flux.just("inventory service is down at this time !!");
    }

    @GetMapping("/shipmentServiceFallback")
    public Flux<String> shipmentServiceFallback() {
        return Flux.just("shipment service is down at this time !!");
    }

    @GetMapping("/notificationServiceFallback")
    public Flux<String> notificationServiceFallback() {
        return Flux.just("notification service is down at this time !!");
    }

    @GetMapping("/configurationServiceFallback")
    public Flux<String> configurationServiceFallback() {
        return Flux.just("configuration service is down at this time !!");
    }

}