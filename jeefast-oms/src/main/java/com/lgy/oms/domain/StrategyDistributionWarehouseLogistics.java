package com.lgy.oms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lgy.common.annotation.Excel;
import com.lgy.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 配货策略分仓物流规则表 oms_strategy_distribution_warehouse_logistics
 *
 * @author lgy
 * @date 2020-02-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oms_strategy_distribution_warehouse_logistics")
public class StrategyDistributionWarehouseLogistics extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 策略编码
     */
    @Excel(name = "策略编码")
    private String gco;

    /**
     * 仓库编码
     */
    @Excel(name = "仓库编码")
    private String warehouse;

    /**
     * 优先级
     */
    @Excel(name = "优先级")
    private Integer priority;

    /**
     * 物流编码
     */
    @Excel(name = "物流编码")
    private String logistics;

    /**
     * 是否到达
     */
    @Excel(name = "是否到达")
    private Integer arrive;

    /**
     * 状态（0启用 1停用）
     */
    @Excel(name = "状态", readConverterExp = "0=启用,1=停用")
    private Integer status;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;

}
