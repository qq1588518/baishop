package com.baishop.entity.ass;

import java.io.Serializable;

public class SyslogFilter implements Serializable {

	private static final long serialVersionUID = 1914080801787451445L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column syslog_filter.id
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column syslog_filter.filter
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    private String filter;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column syslog_filter.enable
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    private Byte enable;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column syslog_filter.id
     *
     * @return the value of syslog_filter.id
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column syslog_filter.id
     *
     * @param id the value for syslog_filter.id
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column syslog_filter.filter
     *
     * @return the value of syslog_filter.filter
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public String getFilter() {
        return filter;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column syslog_filter.filter
     *
     * @param filter the value for syslog_filter.filter
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column syslog_filter.enable
     *
     * @return the value of syslog_filter.enable
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column syslog_filter.enable
     *
     * @param enable the value for syslog_filter.enable
     *
     * @ibatorgenerated Tue Mar 13 14:56:29 CST 2012
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }
}