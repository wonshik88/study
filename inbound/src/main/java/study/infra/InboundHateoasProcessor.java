package study.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import study.domain.*;

@Component
public class InboundHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Inbound>> {

    @Override
    public EntityModel<Inbound> process(EntityModel<Inbound> model) {
        return model;
    }
}
