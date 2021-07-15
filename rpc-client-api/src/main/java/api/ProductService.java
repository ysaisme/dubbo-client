package api;

import po.ProductReducePO;

import java.util.List;

/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 2021/7/14 16:19
 * Modified By:
 */
public interface ProductService {

    /**
     * 减库存
     * @param productReduceList
     */
    void reduceQty(List<ProductReducePO> productReduceList);
}
