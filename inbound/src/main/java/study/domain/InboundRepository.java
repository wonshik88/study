package study.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import study.domain.*;

@RepositoryRestResource(collectionResourceRel = "inbounds", path = "inbounds")
public interface InboundRepository
    extends PagingAndSortingRepository<Inbound, Long> {}
