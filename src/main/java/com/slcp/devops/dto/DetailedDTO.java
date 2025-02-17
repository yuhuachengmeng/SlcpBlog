package com.slcp.devops.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Slcp
 * @date: 2020/9/22 13:18
 * @code: 一生的挚爱
 * @description: 博客详情实体类
 */
@Data
public class DetailedDTO implements Serializable {
    private static final long serialVersionUID = -5109782578272943999L;
    private Long id;
    private String firstPicture;
    private String flag;
    private String title;
    private String content;

    private Integer views;
    private Integer commentCount;
    private Date updateTime;
    private Boolean commentabled;
    private Boolean shareStatement;
    private Boolean appreciation;

    private String nickname;
    private String avatar;

    /**
     * Type
     */
    private String typeName;
}
