package com.wl.hrm.service.impl;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.wl.hrm.dao.CourseType;
import com.wl.hrm.mapper.CourseTypeMapper;
import com.wl.hrm.query.CourseTypeQuery;
import com.wl.hrm.service.ICourseTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wl.hrm.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程目录 服务实现类
 * </p>
 *
 * @author wl
 * @since 2020-07-31
 */
@Service
public class CourseTypeServiceImpl extends ServiceImpl<CourseTypeMapper, CourseType> implements ICourseTypeService {

    @Autowired
    private CourseTypeMapper courseTypeMapper;
    @Override
    public PageList<CourseType> selectPageList(CourseTypeQuery query) {
        Page page = new Page(query.getPage(),query.getRows());//page
        List<CourseType> courseType = courseTypeMapper.loadListPage(page, query);
        return new PageList<>(page.getTotal(),courseType);
    }
}
