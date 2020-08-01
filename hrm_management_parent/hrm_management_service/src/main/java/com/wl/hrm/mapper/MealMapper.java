package com.wl.hrm.mapper;

import com.wl.hrm.dao.Meal;
import com.baomidou.mybatisplus.mapper.BaseMapper;

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
public interface MealMapper extends BaseMapper<Meal> {

    void saveTenantMeals(List<Map<String, Long>> mealsMap);
}
