package com.company.TaskList;

import java.util.Date;

public class Tasks {
    public String header;
    public String description;
    public String priority;
    public Date creationDate;
    public Date endDate;
    public String perform;
    public String completedRemark;

    public Tasks(String header, String description, String priority, Date creationDate, Date endDate, String perform, String completedRemark) {
        this.header = header;
        this.description = description;
        this.priority = priority;
        this.creationDate = creationDate;
        this.endDate = endDate;
        this.perform = perform;
        this.completedRemark = completedRemark;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPerform() {
        return perform;
    }

    public void setPerform(String perform) {
        this.perform = perform;
    }

    public String getCompletedRemark() {
        return completedRemark;
    }

    public void setCompletedRemark(String completedRemark) {
        this.completedRemark = completedRemark;
    }

    public String toString(){
        return "Заголовок: " + header + ".|| " + "Описание: "
                + description + ".|| " + "Приоритет: " + priority + ".|| "
                + "Дата создания: " + creationDate + ".|| " + "Дата окончания: " + endDate + ".|| "
                + "Исполнитель: " + perform + ".|| " + "Отметка о выполнении: " + completedRemark + ".|| ";
    }
}
