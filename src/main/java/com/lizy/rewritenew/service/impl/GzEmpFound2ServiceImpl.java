package com.lizy.rewritenew.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.GzEmpFound2;
import com.lizy.rewritenew.entity.LowOriginSimple;
import com.lizy.rewritenew.entity.OriginSimple;
import com.lizy.rewritenew.service.GzEmpFound2Service;
import com.lizy.rewritenew.mapper.GzEmpFound2Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author 67317
* @description 针对表【GZ_EMP_FOUND2】的数据库操作Service实现
* @createDate 2024-12-25 18:42:56
*/
@Service
public class GzEmpFound2ServiceImpl extends ServiceImpl<GzEmpFound2Mapper, GzEmpFound2>
    implements GzEmpFound2Service{

    @Override
    public List<LowOriginSimple> listSimple() {
        return this.getBaseMapper().listSimple();
    }

    @Override
    public List<LowOriginSimple> listAllPerson() {
        return this.getBaseMapper().listAllPerson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateBatchForIdName(List<LowOriginSimple> updateList) {
        this.getBaseMapper().updateBatchForIdName(updateList);
    }

    @Override
    public List<NameValueDTO> listAllPositionName() {
        return this.getBaseMapper().listDistinctMc();
    }

    @Override
    public List<NameValueDTO> listAllSchoolName() {
        return this.getBaseMapper().listAllSchoolName();
    }

    @Override
    public List<NameValueDTO> listAllSchoolFirstName() {
        return this.getBaseMapper().listAllSchoolFirstName();
    }



    @Override
    public List<NameValueDTO> listAllCryptPositionMap() {
        return this.getBaseMapper().listAllCryptPositionMap();
    }

    @Override
    public List<NameValueDTO> listAllCryptSchoolMap() {
        return this.getBaseMapper().listAllCryptSchoolMap();
    }

    @Override
    public void updateBatchForSchool(List<NameValueDTO> dtoList) {
        this.getBaseMapper().updateBatchForSchool(dtoList);
    }

    @Override
    public void updateBatchForPosition(List<NameValueDTO> dtoList) {
        this.getBaseMapper().updateBatchForPosition(dtoList);
    }

}




