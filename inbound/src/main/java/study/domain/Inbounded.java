package study.domain;

import java.util.*;
import lombok.*;
import study.domain.*;
import study.infra.AbstractEvent;

@Data
@ToString
public class Inbounded extends AbstractEvent {

    private Long id;
    private String skukey;
    private Float qtyrcv;
    private Date arcptd;

    public Inbounded(Inbound aggregate) {
        super(aggregate);
    }

    public Inbounded() {
        super();
    }
    // keep

}
