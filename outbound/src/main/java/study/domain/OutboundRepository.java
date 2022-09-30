package study.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import study.domain.*;

@RepositoryRestResource(collectionResourceRel = "outbounds", path = "outbounds")
public interface OutboundRepository
    extends PagingAndSortingRepository<Outbound, Long> {}
