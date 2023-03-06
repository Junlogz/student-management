package com.student.manage.vo.admin;

import com.github.pagehelper.PageInfo;
import com.student.manage.util.JsonUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "PageInfoVO", description = "分页信息")
public class PageInfoVO<T> {

    @ApiModelProperty(value = "当前页", dataType = "Integer")
    private Integer pageNum;
    @ApiModelProperty(value = "每页条数", dataType = "Integer")
    private Integer pageSize;
    @ApiModelProperty(value = "总数", example = "1", dataType = "Long")
    private Long total;
    @ApiModelProperty(value = "结果集合", dataType = "List")
    private List<T> list;

    public PageInfoVO() {}

    public PageInfoVO(Integer pageNum, Integer pageSize, Long total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    public PageInfoVO(PageInfo pageInfo) {
        this(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList());
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setPageInfoWithoutList(PageInfo pageInfo) {
        if (pageInfo == null){
            return;
        }

        this.setPageSize(pageInfo.getPageSize());
        this.setPageNum(pageInfo.getPageNum());
        this.setTotal(pageInfo.getTotal());
    }

    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }

}
