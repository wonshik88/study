package study.domain;

import java.util.*;
import lombok.*;
import study.domain.*;
import study.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String skukey;
    private Float qtsiwh;
    private Date lota12;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
    // keep

}
