package com.cz.seckill.seckill.database.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MmallOrderItem implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.order_no
     *
     * @mbggenerated
     */
    private Long orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.product_id
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.product_image
     *
     * @mbggenerated
     */
    private String productImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.current_unit_price
     *
     * @mbggenerated
     */
    private BigDecimal currentUnitPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.quantity
     *
     * @mbggenerated
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.total_price
     *
     * @mbggenerated
     */
    private BigDecimal totalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order_item.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mmall_order_item
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.id
     *
     * @return the value of mmall_order_item.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.id
     *
     * @param id the value for mmall_order_item.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.user_id
     *
     * @return the value of mmall_order_item.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.user_id
     *
     * @param userId the value for mmall_order_item.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.order_no
     *
     * @return the value of mmall_order_item.order_no
     *
     * @mbggenerated
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.order_no
     *
     * @param orderNo the value for mmall_order_item.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.product_id
     *
     * @return the value of mmall_order_item.product_id
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.product_id
     *
     * @param productId the value for mmall_order_item.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.product_name
     *
     * @return the value of mmall_order_item.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.product_name
     *
     * @param productName the value for mmall_order_item.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.product_image
     *
     * @return the value of mmall_order_item.product_image
     *
     * @mbggenerated
     */
    public String getProductImage() {
        return productImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.product_image
     *
     * @param productImage the value for mmall_order_item.product_image
     *
     * @mbggenerated
     */
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.current_unit_price
     *
     * @return the value of mmall_order_item.current_unit_price
     *
     * @mbggenerated
     */
    public BigDecimal getCurrentUnitPrice() {
        return currentUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.current_unit_price
     *
     * @param currentUnitPrice the value for mmall_order_item.current_unit_price
     *
     * @mbggenerated
     */
    public void setCurrentUnitPrice(BigDecimal currentUnitPrice) {
        this.currentUnitPrice = currentUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.quantity
     *
     * @return the value of mmall_order_item.quantity
     *
     * @mbggenerated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.quantity
     *
     * @param quantity the value for mmall_order_item.quantity
     *
     * @mbggenerated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.total_price
     *
     * @return the value of mmall_order_item.total_price
     *
     * @mbggenerated
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.total_price
     *
     * @param totalPrice the value for mmall_order_item.total_price
     *
     * @mbggenerated
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.create_time
     *
     * @return the value of mmall_order_item.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.create_time
     *
     * @param createTime the value for mmall_order_item.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order_item.update_time
     *
     * @return the value of mmall_order_item.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order_item.update_time
     *
     * @param updateTime the value for mmall_order_item.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order_item
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productImage=").append(productImage);
        sb.append(", currentUnitPrice=").append(currentUnitPrice);
        sb.append(", quantity=").append(quantity);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}