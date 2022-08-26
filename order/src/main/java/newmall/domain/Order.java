package newmall.domain;

import newmall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){
        // Get request from Product
        //newmall.external.Product product =
        //    Application.applicationContext.getBean(newmall.external.ProductService.class)
        //    .getProduct(/** mapping value needed */);

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }



    public void order(OrderCommand orderCommand){
        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();

    }



}
