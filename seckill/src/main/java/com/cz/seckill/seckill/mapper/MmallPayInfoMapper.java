package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.MmallPayInfo;
import java.util.List;

public interface MmallPayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbggenerated
     */
    int insert(MmallPayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbggenerated
     */
    MmallPayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbggenerated
     */
    List<MmallPayInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MmallPayInfo record);
}