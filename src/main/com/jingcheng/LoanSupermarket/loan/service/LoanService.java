package jingcheng.LoanSupermarket.loan.service;

import jingcheng.utils.response.ReqResponse;

/**
 * 贷款模块逻辑层接口
 */
public interface LoanService {

    /**
     * 贷款轮播页
     */
    ReqResponse carousel();

    /**
     * 贷款头条
     */
    ReqResponse headline();

    /**
     * 热门贷款
     */
    ReqResponse hotLoan(int type, int num);

    /**
     * 新品推荐
     */
    ReqResponse newProducts(int type, int num);

    /**
     * 品牌贷款
     */
    ReqResponse brandLoan(int type, int num);

    /**
     * 大额分期
     */
    ReqResponse largeStaging(int type, int num);

    /**
     * 小额速贷
     */
    ReqResponse smallLoan(int type, int num);

    /**
     * 贷款详情
     */
    ReqResponse loan(Long loanId);
}
