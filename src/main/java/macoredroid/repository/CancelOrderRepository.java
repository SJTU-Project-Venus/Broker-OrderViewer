package macoredroid.repository;

import macoredroid.domain.CancelOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CancelOrderRepository extends MongoRepository<CancelOrder, String> {
    @RestResource(path = "traderName", rel = "traderName")
    public List<CancelOrder> findAllByTraderNameLike(String traderName);
}
