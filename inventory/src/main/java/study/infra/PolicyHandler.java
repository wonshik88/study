package study.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import study.config.kafka.KafkaProcessor;
import study.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryRepository inventoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Inbounded'"
    )
    public void wheneverInbounded_Inbound(@Payload Inbounded inbounded) {
        Inbounded event = inbounded;
        System.out.println(
            "\n\n##### listener Inbound : " + inbounded + "\n\n"
        );

        // Sample Logic //
        Inventory.inbound(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Outbounded'"
    )
    public void wheneverOutbounded_Outbound(@Payload Outbounded outbounded) {
        Outbounded event = outbounded;
        System.out.println(
            "\n\n##### listener Outbound : " + outbounded + "\n\n"
        );

        // Sample Logic //
        Inventory.outbound(event);
    }
    // keep

}
