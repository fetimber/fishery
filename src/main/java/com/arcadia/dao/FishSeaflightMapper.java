package com.arcadia.dao;

import com.arcadia.model.FishSeaflight;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FishSeaflightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    int insert(FishSeaflight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    int insertSelective(FishSeaflight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    FishSeaflight selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    int updateByPrimaryKeySelective(FishSeaflight record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fish_seaflight
     *
     * @mbggenerated Tue Nov 28 23:54:08 CST 2017
     */
    int updateByPrimaryKey(FishSeaflight record);
}