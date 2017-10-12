/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_time_logging*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_time_logging")
@Alias("ItemTimeLogging")
public class ItemTimeLogging extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.id
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.projectId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.type
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.typeId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("typeId")
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.logValue
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("logValue")
    private Double logvalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.loguser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("loguser")
    private String loguser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.createdTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.lastUpdatedTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.sAccountId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.logForDay
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("logForDay")
    private Date logforday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.isBillable
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("isBillable")
    private Boolean isbillable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.createdUser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.isOvertime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Column("isOvertime")
    private Boolean isovertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_time_logging.note
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("note")
    private String note;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ItemTimeLogging item = (ItemTimeLogging)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1429, 1273).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.id
     *
     * @return the value of m_prj_time_logging.id
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.id
     *
     * @param id the value for m_prj_time_logging.id
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.projectId
     *
     * @return the value of m_prj_time_logging.projectId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.projectId
     *
     * @param projectid the value for m_prj_time_logging.projectId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.type
     *
     * @return the value of m_prj_time_logging.type
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.type
     *
     * @param type the value for m_prj_time_logging.type
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.typeId
     *
     * @return the value of m_prj_time_logging.typeId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.typeId
     *
     * @param typeid the value for m_prj_time_logging.typeId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.logValue
     *
     * @return the value of m_prj_time_logging.logValue
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Double getLogvalue() {
        return logvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.logValue
     *
     * @param logvalue the value for m_prj_time_logging.logValue
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setLogvalue(Double logvalue) {
        this.logvalue = logvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.loguser
     *
     * @return the value of m_prj_time_logging.loguser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public String getLoguser() {
        return loguser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.loguser
     *
     * @param loguser the value for m_prj_time_logging.loguser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setLoguser(String loguser) {
        this.loguser = loguser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.createdTime
     *
     * @return the value of m_prj_time_logging.createdTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.createdTime
     *
     * @param createdtime the value for m_prj_time_logging.createdTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.lastUpdatedTime
     *
     * @return the value of m_prj_time_logging.lastUpdatedTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_time_logging.lastUpdatedTime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.sAccountId
     *
     * @return the value of m_prj_time_logging.sAccountId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.sAccountId
     *
     * @param saccountid the value for m_prj_time_logging.sAccountId
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.logForDay
     *
     * @return the value of m_prj_time_logging.logForDay
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Date getLogforday() {
        return logforday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.logForDay
     *
     * @param logforday the value for m_prj_time_logging.logForDay
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setLogforday(Date logforday) {
        this.logforday = logforday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.isBillable
     *
     * @return the value of m_prj_time_logging.isBillable
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Boolean getIsbillable() {
        return isbillable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.isBillable
     *
     * @param isbillable the value for m_prj_time_logging.isBillable
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setIsbillable(Boolean isbillable) {
        this.isbillable = isbillable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.createdUser
     *
     * @return the value of m_prj_time_logging.createdUser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.createdUser
     *
     * @param createduser the value for m_prj_time_logging.createdUser
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.isOvertime
     *
     * @return the value of m_prj_time_logging.isOvertime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public Boolean getIsovertime() {
        return isovertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.isOvertime
     *
     * @param isovertime the value for m_prj_time_logging.isOvertime
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setIsovertime(Boolean isovertime) {
        this.isovertime = isovertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_time_logging.note
     *
     * @return the value of m_prj_time_logging.note
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_time_logging.note
     *
     * @param note the value for m_prj_time_logging.note
     *
     * @mbg.generated Tue Aug 01 11:17:38 ICT 2017
     */
    public void setNote(String note) {
        this.note = note;
    }

    public enum Field {
        id,
        projectid,
        type,
        typeid,
        logvalue,
        loguser,
        createdtime,
        lastupdatedtime,
        saccountid,
        logforday,
        isbillable,
        createduser,
        isovertime,
        note;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}