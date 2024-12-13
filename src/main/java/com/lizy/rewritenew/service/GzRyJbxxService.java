package com.lizy.rewritenew.service;

import com.lizy.rewritenew.entity.GzRyJbxx;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lizy.rewritenew.entity.OriginSimple;

import java.util.List;

/**
* @author 67317
* @description 针对表【GZ_RY_JBXX】的数据库操作Service
* @createDate 2024-12-13 10:55:19
*/
public interface GzRyJbxxService extends IService<GzRyJbxx> {

    /**
     * 简单列表
     *
     * @return {@link List }<{@link OriginSimple }>
     */
    List<OriginSimple> listSimple();

    /**
     * 更新id名称批处理
     *
     * @param updateList 更新列表
     */
    void updateBatchForIdName(List<OriginSimple> updateList);

    List<String> listAllPositionName();

}
