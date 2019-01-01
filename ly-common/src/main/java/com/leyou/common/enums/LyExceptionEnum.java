package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LyExceptionEnum {

    PARAM_CANNOT_BE_NULL(400, "参数不能为空"),
    PARAM_INVALID(400, "传递的参数无效"),
    FILE_TYPE_ERROR(400, "不支持的文件格式"),
    CATEGORY_LIST_NOT_FOUND(404, "未查询到分类列表"),
    BRAND_LIST_NOT_FOUND(404, "未查询到品牌列表"),
    SPU_LIST_NOT_FOUND(404, "未查询到商品列表"),
    SPU_NOT_FOUND(404, "未查询到商品列表"),
    BRAND_NOT_FOUND(404, "该品牌不存在"),
    GOODS_NOT_FOUND(404, "该商品不存在"),
    SKU_LIST_NOT_FOUND(404, "未查询到SKU列表"),
    CATEGORY_NOT_FOUND(404, "该分类不存在"),
    PARENT_CATEGORY_NOT_FOUND(404, "该父分类不存在"),
    SAVE_FAILURE(500, "保存失败"),
    DELETE_FAILURE(500, "删除失败"),
    CATEGORY_DELETE_INVALID(500, "该分类下含有子分类，请先删除其子分类"),
    READ_FILE_FAILURE(500, "读取文件内容失败"),
    ;
    private int code;
    private String message;
}