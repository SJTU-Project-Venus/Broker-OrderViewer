package macoredroid.brokerQuery.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;
@Data
@Repository
public class CancelOrder {
    @Id
    private String id;
    private Type targetType;
    private int unitPrice;
    private Side side;
    private String targetId;
    private String marketDepthId;
    private Status status;
    private String creationTime;
    private String traderName;
    private String futureName;
    private String statusSwitchTime;
}
