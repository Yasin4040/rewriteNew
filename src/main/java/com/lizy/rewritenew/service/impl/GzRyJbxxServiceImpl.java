package com.lizy.rewritenew.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lizy.rewritenew.entity.GzRyJbxx;
import com.lizy.rewritenew.entity.OriginSimple;
import com.lizy.rewritenew.service.GzRyJbxxService;
import com.lizy.rewritenew.mapper.GzRyJbxxMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
* @author 67317
* @description 针对表【GZ_RY_JBXX】的数据库操作Service实现
* @createDate 2024-12-13 10:55:19
*/
@Service
public class GzRyJbxxServiceImpl extends ServiceImpl<GzRyJbxxMapper, GzRyJbxx>
    implements GzRyJbxxService{

    @Override
    public List<OriginSimple> listSimple() {
        return this.getBaseMapper().listSimple();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateBatchForIdName(List<OriginSimple> updateList) {
        this.getBaseMapper().updateBatchForIdName(updateList);
    }

    @Override
    public List<String> listAllPositionName() {
        return this.getBaseMapper().listDistinctMc();
    }
}




