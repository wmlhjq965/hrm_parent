package com.wl.hrm.mapper;

import com.wl.hrm.dao.Tenant;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wl
 * @since 2020-08-01
 */
public interface TenantMapper extends BaseMapper<Tenant> {
    /**
     * 保存机构所对应的套餐的中间表信息
     * @param mealsMap
     */
    void saveTenantMeals(List<Map<String, Long>> mealsMap);

    /**
     * 删除中间表
     * @param id
     */
    void removeTenantMeal(Serializable id);
}
