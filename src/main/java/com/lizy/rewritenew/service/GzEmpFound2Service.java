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

    List<NameValueDTO> listAllPositionName();

    /**
     * 列出所有学校名称
     *
     * @return {@link List }<{@link String }>
     */
    List<NameValueDTO> listAllSchoolName();

    /**
     * 列出所有学校名称
     *
     * @return {@link List }<{@link String }>
     */
    List<NameValueDTO> listAllSchoolFirstName();


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

    void updateBatchForSchool(List<NameValueDTO> dtoList);

    void updateBatchForPosition(List<NameValueDTO> dtoList);

}
