package macoredroid.brokerQuery.repository;

import macoredroid.brokerQuery.domain.MarketDepth;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketDepthDTORepository extends MongoRepository<MarketDepth, String> {

}
