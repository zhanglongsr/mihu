package com.liepin.h.web.common.form;

import java.util.ArrayList;
import java.util.List;

import com.liepin.swift.framework.form.BaseForm;

/**
 * 分页查询返回 T表示翻页数据的类型,T范型不能继承IEntity和BaseDto
 * 
 * @author: lifs
 * @create: 2018-03-06 13:39
 **/
public class PageForm<T> extends BaseForm {

    private static final long serialVersionUID = -2601510119239989810L;
    private List<T> list;

    private Integer totalCount;

    private Integer curPage;

    private Integer pageSize;

    // 列表中经常需要的额外信息
    private int extraCount;

    public PageForm(List<T> list, Integer totalCount, Integer curPage, Integer pageSize) {
        if (list == null) {
            this.list = new ArrayList<T>();
        } else {
            this.list = list;
        }
        this.totalCount = totalCount;
        this.curPage = curPage;
        this.pageSize = pageSize;
    }

    public PageForm() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public int getExtraCount() {
        return extraCount;
    }

    public void setExtraCount(int extraCount) {
        this.extraCount = extraCount;
    }
}
