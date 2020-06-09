package macoredroid.domain;

import lombok.Data;
import macoredroid.Util;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "orderBlotterDTO")
public class OrderBlotter {
    @Id
    private String id;
    private int count;
    private int price;
    private String creationTime;
    private String buyerTraderName;
    private String sellerTraderName;
    private String buyerOrderId;
    private String sellerOrderId;
    private String marketDepthId;

    public boolean isCreationTimeBetween(String start, String end){
        Date startTime = Util.convertString2Date(start);
        Date creationTime = Util.convertString2Date(getCreationTime());
        Date endTime = Util.convertString2Date(end);
        return startTime.before(creationTime) && endTime.after(creationTime);
    }
}
