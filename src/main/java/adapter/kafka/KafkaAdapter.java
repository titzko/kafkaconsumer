package adapter.kafka;

import application.model.Temperature;
import io.micronaut.configuration.kafka.annotation.*;
import io.micronaut.http.annotation.Body;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;

@KafkaListener(
        offsetReset = OffsetReset.EARLIEST,
        offsetStrategy = OffsetStrategy.DISABLED
)
public class KafkaAdapter {

    @Topic("Temperaturen")
    public void receive(@Body Temperature temperatur){
        System.out.println(temperatur.toString());
    }
}
