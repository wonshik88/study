package study.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import study.domain.*;

@Component
public class OutboundHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Outbound>> {

    @Override
    public EntityModel<Outbound> process(EntityModel<Outbound> model) {
        return model;
    }
}
