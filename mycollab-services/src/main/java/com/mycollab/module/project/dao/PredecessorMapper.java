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
package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.Predecessor;
import com.mycollab.module.project.domain.PredecessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface PredecessorMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    long countByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int deleteByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int insert(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int insertSelective(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    List<Predecessor> selectByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    Predecessor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int updateByExampleSelective(@Param("record") Predecessor record, @Param("example") PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int updateByExample(@Param("record") Predecessor record, @Param("example") PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int updateByPrimaryKeySelective(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    int updateByPrimaryKey(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    Integer insertAndReturnKey(Predecessor value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Tue Aug 01 11:17:37 ICT 2017
     */
    void massUpdateWithSession(@Param("record") Predecessor record, @Param("primaryKeys") List primaryKeys);
}