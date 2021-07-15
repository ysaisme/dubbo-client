package po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 2021/7/14 16:44
 * Modified By:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductReducePO implements Serializable {

    private String spu;

    private Integer qty;
}
