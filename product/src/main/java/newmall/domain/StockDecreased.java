package newmall.domain;

import newmall.domain.*;
import newmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer stock;

    public StockDecreased(Product aggregate){
        super(aggregate);
    }
    public StockDecreased(){
        super();
    }
    // keep

}
