package com.lizy.rewritenew.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizy.rewritenew.entity.GzEmpFound2;
import com.lizy.rewritenew.entity.LowOriginSimple;
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
}




