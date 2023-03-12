package com.student.manage.params;

import com.student.manage.util.JsonUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "BasePageParams", description = "分页参数")
public class BasePageParams {

    @ApiModelProperty(value = "当前页 1开始", required = true, example = "1", dataType = "Integer")
    private Integer pageNum = 1;
    @ApiModelProperty(value = "每页结果数", required = true, example = "10", dataType = "Integer")
    private Integer pageSize = 10;
//    @ApiModelProperty(value = "排序", dataType = "String")
//    private String orderBy;

//    @ApiModelProperty(value = "ID集合")
//    private List<Long> messageUserIdList;

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

//    public String getOrderBy() {
//        return orderBy;
//    }
//
//    public void setOrderBy(String orderBy) {
//        this.orderBy = orderBy;
//    }

//    public List<Long> getMessageUserIdList() {
//        return messageUserIdList;
//    }
//
//    public void setMessageUserIdList(List<Long> messageUserIdList) {
//        this.messageUserIdList = messageUserIdList;
//    }

    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }
}
