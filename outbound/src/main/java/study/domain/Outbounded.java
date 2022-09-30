package study.domain;

import java.util.*;
import lombok.*;
import study.domain.*;
import study.infra.AbstractEvent;

@Data
@ToString
public class Outbounded extends AbstractEvent {

    private Long id;
    private String skukey;
    private String qtshpd;
    private String rqshpd;

    public Outbounded(Outbound aggregate) {
        super(aggregate);
    }

    public Outbounded() {
        super();
    }
    // keep

}
