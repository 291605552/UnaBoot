package com.ramostear.unaboot.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author :       ramostear/树下魅狐
 * @version :     Una-Boot-1.3.0
 * <p>This java file was created by ramostear in 2020/6/1 0001 18:48.
 * The following is the description information about this file:</p>
 * <p>description:</p>
 */
@Data
public class ThemeFolder {
    private String id;
    private String pid;
    private String name;
    private String size;
    private boolean folder;
    private Date modifyDate;
}
