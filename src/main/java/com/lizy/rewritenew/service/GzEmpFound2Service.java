package com.lizy.rewritenew.service;

import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.GzEmpFound2;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lizy.rewritenew.entity.LowOriginSimple;
import com.lizy.rewritenew.entity.OriginSimple;

import java.util.List;

/**
* @author 67317
* @description 针对表【GZ_EMP_FOUND2】的数据库操作Service
* @createDate 2024-12-25 18:42:56
*/
public interface GzEmpFound2Service extends IService<GzEmpFound2> {
    /**
     * 简单列表
     *
     * @return {@link List }<{@link OriginSimple }>
     */
    List<LowOriginSimple> listSimple();

    List<LowOriginSimple> listAllPerson();

    /**
     * 更新id名称批处理
     *
     * @param updateList 更新列表
     */
    void updateBatchForIdName(List<LowOriginSimple> updateList);

}
