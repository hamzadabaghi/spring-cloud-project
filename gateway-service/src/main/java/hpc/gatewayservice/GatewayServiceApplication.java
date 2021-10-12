package hpc.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    /* dynamic configuration  , static(rename file a.properties to application.properties) */

    /* we say to spring cloud gateway :

    I don't know the routes ;
    each time you receive the requests
    the name of the microservices in the url

     */
    @Bean
     DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties){
         return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
     }

    /* Ribon : load balancer service */
}
