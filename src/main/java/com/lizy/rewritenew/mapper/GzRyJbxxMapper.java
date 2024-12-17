package com.lizy.rewritenew.mapper;

import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.GzRyJbxx;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lizy.rewritenew.entity.OriginSimple;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author 67317
* @description 针对表【GZ_RY_JBXX】的数据库操作Mapper
* @createDate 2024-12-13 10:55:19
* @Entity com.lizy.rewritenew.entity.GzRyJbxx
*/
public interface GzRyJbxxMapper extends BaseMapper<GzRyJbxx> {

    /**
     * 简单列表
     *
     * @return {@link List }<{@link OriginSimple }>
     */
    List<OriginSimple> listSimple();

    List<NameValueDTO> listDistinctMc();

    /**
     * 更新id名称批处理
     *
     * @param updateList 更新列表
     */
    void updateBatchForIdName(@Param("updateList") List<OriginSimple> updateList);

    List<NameValueDTO> listAllSchoolName();

    List<NameValueDTO> listAllCryptPositionMap();

    List<NameValueDTO> listAllCryptSchoolMap();
}




