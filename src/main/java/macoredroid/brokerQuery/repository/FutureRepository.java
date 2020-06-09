package macoredroid.brokerQuery.repository;

import macoredroid.brokerQuery.domain.Future;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutureRepository extends MongoRepository<Future, String> {
}
