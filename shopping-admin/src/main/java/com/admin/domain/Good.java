package com.admin.domain;


import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 good
 *
 * @author ruoyi
 * @date 2021-08-23
 */
public class Good
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private String gname;

    /** $column.columnComment */
    private BigDecimal bid;

    /** $column.columnComment */
    private BigDecimal price;

    /** $column.columnComment */
    private Long stock;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setGname(String gname)
    {
        this.gname = gname;
    }

    public String getGname()
    {
        return gname;
    }
    public void setBid(BigDecimal bid)
    {
        this.bid = bid;
    }

    public BigDecimal getBid()
    {
        return bid;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getPrice()
    {
        return price;
    }
    public void setStock(Long stock)
    {
        this.stock = stock;
    }

    public Long getStock()
    {
        return stock;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", gname='" + gname + '\'' +
                ", bid=" + bid +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}