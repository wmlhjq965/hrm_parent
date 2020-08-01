package com.wl.hrm.dao;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wl
 * @since 2020-08-01
 */
@TableName("t_department")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 对应部门
     */
    private String sn;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门节点
     */
    private String dirPath;
    /**
     * 状态
     */
    private Integer state;
    @TableField("manager_id")
    private Long managerId;
    /**
     * 父节点id
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 租户id
     */
    @TableField("tenant_id")
    private Long tenantId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Department{" +
        ", id=" + id +
        ", sn=" + sn +
        ", name=" + name +
        ", dirPath=" + dirPath +
        ", state=" + state +
        ", managerId=" + managerId +
        ", parentId=" + parentId +
        ", tenantId=" + tenantId +
        "}";
    }
}
