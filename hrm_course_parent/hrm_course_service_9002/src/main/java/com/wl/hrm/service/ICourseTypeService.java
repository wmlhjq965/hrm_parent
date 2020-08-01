package com.wl.hrm.service;

import com.wl.hrm.dao.CourseType;
import com.baomidou.mybatisplus.service.IService;
import com.wl.hrm.query.CourseTypeQuery;
import com.wl.hrm.util.PageList;

/**
 * <p>
 * 课程目录 服务类
 * </p>
 *
 * @author wl
 * @since 2020-07-31
 */
public interface ICourseTypeService extends IService<CourseType> {

    /**
     * 高级查询+分页+关联查询
     * @param query
     * @return
     */
    PageList<CourseType> selectPageList(CourseTypeQuery query);
}
