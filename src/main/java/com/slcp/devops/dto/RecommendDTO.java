package com.slcp.devops.dto;

import com.slcp.devops.entity.Tag;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: Slcp
 * @date: 2020/9/22 13:25
 * @code: 一生的挚爱
 * @description: 推荐博客数据实体类
 */
@Data
public class RecommendDTO implements Serializable {
    private static final long serialVersionUID = -1119782578272943999L;
    private String id;
    private String title;
    private String firstPicture;
    private String recommend;
    private String description;
    private String views;
    private String content;
    private String typeId;
    private String typeName;
    private String path;
    private String code;
    private Date createTime;
    private List<Tag> tags;
}
