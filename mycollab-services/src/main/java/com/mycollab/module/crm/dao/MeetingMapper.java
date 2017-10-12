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
package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.MeetingExample;
import com.mycollab.module.crm.domain.MeetingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface MeetingMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    long countByExample(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int deleteByExample(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Delete({
        "delete from m_crm_meeting",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Insert({
        "insert into m_crm_meeting (id, subject, ",
        "status, type, typeid, ",
        "startDate, endDate, ",
        "lastUpdatedTime, createdTime, ",
        "createdUser, sAccountId, ",
        "location, isRecurrence, ",
        "recurrenceType, recurrenceStartDate, ",
        "recurrenceEndDate, contactType, ",
        "contactTypeId, isClosed, ",
        "isNotified, isNotifiedPrior, ",
        "description, recurrenceInfo)",
        "values (#{id,jdbcType=INTEGER}, #{subject,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{typeid,jdbcType=INTEGER}, ",
        "#{startdate,jdbcType=TIMESTAMP}, #{enddate,jdbcType=TIMESTAMP}, ",
        "#{lastupdatedtime,jdbcType=TIMESTAMP}, #{createdtime,jdbcType=TIMESTAMP}, ",
        "#{createduser,jdbcType=VARCHAR}, #{saccountid,jdbcType=INTEGER}, ",
        "#{location,jdbcType=VARCHAR}, #{isrecurrence,jdbcType=BIT}, ",
        "#{recurrencetype,jdbcType=VARCHAR}, #{recurrencestartdate,jdbcType=TIMESTAMP}, ",
        "#{recurrenceenddate,jdbcType=TIMESTAMP}, #{contacttype,jdbcType=VARCHAR}, ",
        "#{contacttypeid,jdbcType=INTEGER}, #{isclosed,jdbcType=BIT}, ",
        "#{isnotified,jdbcType=BIT}, #{isnotifiedprior,jdbcType=INTEGER}, ",
        "#{description,jdbcType=LONGVARCHAR}, #{recurrenceinfo,jdbcType=LONGVARCHAR})"
    })
    int insert(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int insertSelective(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    List<MeetingWithBLOBs> selectByExampleWithBLOBs(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Select({
        "select",
        "id, subject, status, type, typeid, startDate, endDate, lastUpdatedTime, createdTime, ",
        "createdUser, sAccountId, location, isRecurrence, recurrenceType, recurrenceStartDate, ",
        "recurrenceEndDate, contactType, contactTypeId, isClosed, isNotified, isNotifiedPrior, ",
        "description, recurrenceInfo",
        "from m_crm_meeting",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.MeetingMapper.ResultMapWithBLOBs")
    MeetingWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByExampleSelective(@Param("record") MeetingWithBLOBs record, @Param("example") MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") MeetingWithBLOBs record, @Param("example") MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    int updateByPrimaryKeySelective(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    @Update({
        "update m_crm_meeting",
        "set subject = #{subject,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "typeid = #{typeid,jdbcType=INTEGER},",
          "startDate = #{startdate,jdbcType=TIMESTAMP},",
          "endDate = #{enddate,jdbcType=TIMESTAMP},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "location = #{location,jdbcType=VARCHAR},",
          "isRecurrence = #{isrecurrence,jdbcType=BIT},",
          "recurrenceType = #{recurrencetype,jdbcType=VARCHAR},",
          "recurrenceStartDate = #{recurrencestartdate,jdbcType=TIMESTAMP},",
          "recurrenceEndDate = #{recurrenceenddate,jdbcType=TIMESTAMP},",
          "contactType = #{contacttype,jdbcType=VARCHAR},",
          "contactTypeId = #{contacttypeid,jdbcType=INTEGER},",
          "isClosed = #{isclosed,jdbcType=BIT},",
          "isNotified = #{isnotified,jdbcType=BIT},",
          "isNotifiedPrior = #{isnotifiedprior,jdbcType=INTEGER},",
          "description = #{description,jdbcType=LONGVARCHAR},",
          "recurrenceInfo = #{recurrenceinfo,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    Integer insertAndReturnKey(MeetingWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbg.generated Tue Aug 01 11:17:27 ICT 2017
     */
    void massUpdateWithSession(@Param("record") MeetingWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}