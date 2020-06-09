package macoredroid.repository;

import macoredroid.domain.Future;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutureRepository extends MongoRepository<Future, String> {
}
