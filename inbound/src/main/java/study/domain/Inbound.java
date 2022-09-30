package study.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import study.InboundApplication;
import study.domain.Inbounded;

@Entity
@Table(name = "Inbound_table")
@Data
public class Inbound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String skukey;

    private Float qtyrcv;

    private Date arcptd;

    @PostPersist
    public void onPostPersist() {
        Inbounded inbounded = new Inbounded(this);
        inbounded.publishAfterCommit();
    }

    public static InboundRepository repository() {
        InboundRepository inboundRepository = InboundApplication.applicationContext.getBean(
            InboundRepository.class
        );
        return inboundRepository;
    }
}
