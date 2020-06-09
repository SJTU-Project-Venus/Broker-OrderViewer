package macoredroid.brokerQuery.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "futureDTO")
public class Future {
    @Id
    String id;
    String description;
    String marketDepthId;
}
