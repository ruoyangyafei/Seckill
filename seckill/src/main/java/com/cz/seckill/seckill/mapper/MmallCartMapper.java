package com.cz.seckill.seckill.mapper;

import com.cz.seckill.seckill.database.model.MmallCart;
import java.util.List;

public interface MmallCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated
     */
    int insert(MmallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated
     */
    MmallCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated
     */
    List<MmallCart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MmallCart record);
}