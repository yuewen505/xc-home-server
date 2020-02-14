package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryPageRequest {
    //接收页面查询的查询条件
    //站点id
    //站点id
    @ApiModelProperty("站点id")
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    @ApiModelProperty("页面ID")
    private String pageName;
    //别名
    @ApiModelProperty("页面别名")
    private String pageAliase;
    //模版id
    @ApiModelProperty("页面模板")
    private String templateId;
    //....
}
