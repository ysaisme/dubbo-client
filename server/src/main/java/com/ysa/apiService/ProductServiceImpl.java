package com.ysa.apiService;

import api.ProductService;
import com.alibaba.fastjson.JSON;
import com.ysa.model.entity.product.ProductSpuDO;
import com.ysa.model.mapper.product.ProductSpuMapper;
import com.ysa.util.DataUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import po.ProductReducePO;

import java.util.Date;
import java.util.List;

/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 2021/7/14 16:21
 * Modified By:
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductSpuMapper spuMapper;

    @Override
    @Transactional
    public void reduceQty(List<ProductReducePO> productReduceList) {
        log.info("-> 减库存 {}", JSON.toJSONString(productReduceList));
        if (DataUtil.isNotEmpty(productReduceList)) {
            productReduceList.forEach(p -> {
                ProductSpuDO spuDO = spuMapper.selectOne(ProductSpuDO.builder()
                        .spu(p.getSpu())
                        .build());
                if (DataUtil.isNotEmpty(spuDO)) {
                    spuMapper.updateByPrimaryKeySelective(ProductSpuDO.builder()
                            .id(spuDO.getId())
                            .qty(spuDO.getQty() - p.getQty())
                            .updateAt(2)
                            .updateTime(new Date())
                            .build());
                }
            });
        }
    }
}
