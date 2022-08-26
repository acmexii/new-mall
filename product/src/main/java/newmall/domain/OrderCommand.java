package newmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class OrderCommand {

        private String productId;
        private String productName;
        private Integer qty;


}
