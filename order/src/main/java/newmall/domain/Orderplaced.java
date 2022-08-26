package newmall.domain;

import newmall.domain.*;
import newmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;

    public Orderplaced(Order aggregate){
        super(aggregate);
    }
    public Orderplaced(){
        super();
    }
    // keep

}
