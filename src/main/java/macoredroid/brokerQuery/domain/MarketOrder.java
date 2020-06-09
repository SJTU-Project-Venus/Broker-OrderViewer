package macoredroid.brokerQuery.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "marketOrderDTO")
public class MarketOrder {
    @Id
    private String id;
    private String marketDepthId;
    private int count;
    private Side side;
    private String creationTime;
    private String traderName;
    private String futureName;
    private String clientId;
    private int totalCount;
    private String statusSwitchTime;
    private Status status;
}
