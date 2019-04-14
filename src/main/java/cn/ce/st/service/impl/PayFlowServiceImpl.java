package cn.ce.st.service.impl;

import cn.ce.st.framework.base.Pagination;
import cn.ce.st.framework.base.SuccessResponseData;
import cn.ce.st.pay.api.PayFlowApi;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;
import cn.ce.st.service.PayFlowService;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hx
 * @date 2019/4/14 18:34
 */
@Slf4j
@Service
public class PayFlowServiceImpl implements PayFlowService {


    @Autowired
    private PayFlowApi payFlowApi;

    @Override
    public Pagination<PayFlowRes> findAll(PayFlowReq payFlowReq) {
        Object responseData = payFlowApi.findAll(payFlowReq);
        log.info("PayFlowServiceImpl  findAll result --->{}", responseData);
//        responseData.get
        return null;
    }
}
