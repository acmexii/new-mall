package newmall.domain;

import newmall.domain.*;
import newmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer stock;

    public StockIncreased(Product aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
    // keep

}
