package cn.ce.st.service;

import cn.ce.st.framework.base.Pagination;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;

/**
 * @author hx
 * @date 2019/4/14 18:34
 */
public interface PayFlowService {
    Pagination<PayFlowRes> findAll(PayFlowReq payFlowReq);
}
