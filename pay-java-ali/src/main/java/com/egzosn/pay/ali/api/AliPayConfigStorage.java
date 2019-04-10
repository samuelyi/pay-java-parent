package com.egzosn.pay.ali.api;

import com.egzosn.pay.common.api.BasePayConfigStorage;

/**
 * 支付配置存储
 *
 * @author egan
 *         <p>
 *         email egzosn@gmail.com
 *         date 2016-5-18 14:09:01
 */
public class AliPayConfigStorage extends BasePayConfigStorage {

    /**
     * 商户应用id
     */
    private String appId;
    /**
     * 商户签约拿到的pid,partner_id的简称，合作伙伴身份等同于 partner
     */
    private String pid;

    /**
     * 商户收款账号
     */
    private String seller;


    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String getAppId() {
        return appId;
    }


    @Override
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }


}
