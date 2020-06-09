package macoredroid.brokerQuery.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Document(collection = "marketDepthDTO")
public class MarketDepth {
    class Composite{
        int price;
        int count;

        public Composite(int count, int price) {
            this.price = price;
            this.count = count;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    @Id
    String id;
    List<Composite> buyers = new ArrayList<>();
    List<Composite> sellers = new ArrayList<>();

    public MarketDepth() {
    }


}
