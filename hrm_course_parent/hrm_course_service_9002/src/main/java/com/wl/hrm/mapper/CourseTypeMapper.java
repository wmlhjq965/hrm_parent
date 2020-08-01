package com.wl.hrm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.wl.hrm.dao.CourseType;
import com.wl.hrm.query.CourseTypeQuery;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 课程目录 Mapper 接口
 * </p>
 *
 * @author yhptest
 * @since 2019-08-31
 */

public interface CourseTypeMapper extends BaseMapper<CourseType> {

    /**
     * @param page
     * @param query
     * @return
     */
    List<CourseType> loadListPage(@Param("page") Pagination page,
                                  @Param("query") CourseTypeQuery query);
}

