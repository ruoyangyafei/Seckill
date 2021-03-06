package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.MmallUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MmallUserMapper {

    int checkUsername(@Param("username") String username);

    MmallUser selectLogin(@Param("username")String username,@Param("password")String password);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated
     */
    int insert(MmallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated
     */
    MmallUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated
     */
    List<MmallUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MmallUser record);
}