package com.lizy.rewritenew.mapper;

import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.GzEmpFound2;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lizy.rewritenew.entity.LowOriginSimple;
import com.lizy.rewritenew.entity.OriginSimple;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 67317
* @description 针对表【GZ_EMP_FOUND2】的数据库操作Mapper
* @createDate 2024-12-25 18:42:56
* @Entity com.lizy.rewritenew.entity.GzEmpFound2
*/
public interface GzEmpFound2Mapper extends BaseMapper<GzEmpFound2> {

    /**
     * 简单列表
     *
     * @return {@link List }<{@link OriginSimple }>
     */
    List<LowOriginSimple> listSimple();

    /**
     * 更新id名称批处理
     *
     * @param updateList 更新列表
     */
    void updateBatchForIdName(@Param("updateList") List<LowOriginSimple> updateList);

    /**
     * 列出所有人
     *
     * @return {@link List }<{@link OriginSimple }>
     */
    List<LowOriginSimple> listAllPerson();

}




