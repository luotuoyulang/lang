package cn.luotuoyulang.lang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 账单
 * </p>
 *
 * @author jobob
 * @since 2019-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ImpsBill implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账单编号
     */
    private String billCode;

    /**
     * 最后修改日期
     */
    private Long billLastmodifyDate;

    /**
     * 时间
     */
    private Long billCreateDate;

    /**
     * 金额
     */
    private Double billCost;

    /**
     * 状态
     */
    private String billStatus;

    /**
     * 客户uuid
     */
    private String billCustomersUuid;

    /**
     * 订单uuid
     */
    private String billOrderUuid;

    /**
     * 服务商uuid
     */
    private String billServiceProviderUuid;

    private String billUuid;

    /**
     * 收款方式:微信/银行卡/支付宝
     */
    private String billReceiptType;

    /**
     * 账单安装费
     */
    private Double billInstallationCost;

    /**
     * 账单上门费
     */
    private Double billVisitCost;

    /**
     * 账单服务费
     */
    private Double billServiceCost;

    /**
     * 抽成比例
     */
    private Double billProportionate;


}
