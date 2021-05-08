package com.laoma.mybatisdemo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告操作记录表
**/
 @Data
 @TableName(value = "ad_action")
public class AdAction implements Serializable {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作标识名
     */
    private String actionName;

    /**
     * 操作标识值
     */
    private String actionValue;

    /**
     * 操作人
     */
    private String createOperator;

    /**
     * 操作时间
     */
    private Date createTime;

    /**
     * 操作记录
     */
    private String actionNote;

    /**
     * majinming@xiaomi.com
	 * 2021-05-07T15:59:58.345
     */
    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 操作标识名
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * 操作标识名
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * 操作标识值
     */
    public String getActionValue() {
        return actionValue;
    }

    /**
     * 操作标识值
     */
    public void setActionValue(String actionValue) {
        this.actionValue = actionValue == null ? null : actionValue.trim();
    }

    /**
     * 操作人
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * 操作人
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    /**
     * 操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 操作记录
     */
    public String getActionNote() {
        return actionNote;
    }

    /**
     * 操作记录
     */
    public void setActionNote(String actionNote) {
        this.actionNote = actionNote == null ? null : actionNote.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actionName=").append(actionName);
        sb.append(", actionValue=").append(actionValue);
        sb.append(", createOperator=").append(createOperator);
        sb.append(", createTime=").append(createTime);
        sb.append(", actionNote=").append(actionNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}