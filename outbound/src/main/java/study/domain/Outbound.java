package study.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import study.OutboundApplication;
import study.domain.Outbounded;

@Entity
@Table(name = "Outbound_table")
@Data
public class Outbound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String skukey;

    private String qtshpd;

    private String rqshpd;

    @PostPersist
    public void onPostPersist() {
        Outbounded outbounded = new Outbounded(this);
        outbounded.publishAfterCommit();
    }

    public static OutboundRepository repository() {
        OutboundRepository outboundRepository = OutboundApplication.applicationContext.getBean(
            OutboundRepository.class
        );
        return outboundRepository;
    }
}
