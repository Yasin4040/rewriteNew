package com.lizy.rewritenew.service;

import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.GzRyJbxx;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lizy.rewritenew.entity.OriginSimple;

import java.util.List;
import java.util.Map;

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

    List<NameValueDTO> listAllPositionName();

    /**
     * 列出所有学校名称
     *
     * @return {@link List }<{@link String }>
     */
    List<NameValueDTO> listAllSchoolName();


    /**
     * 列出所有地穴位置图
     *
     * @return {@link List }<{@link NameValueDTO }>
     */
    List<NameValueDTO> listAllCryptPositionMap();


    /**
     * 列出所有地穴学校地图
     *
     * @return {@link List }<{@link NameValueDTO }>
     */
    List<NameValueDTO> listAllCryptSchoolMap();
}
