package cn.ce.st.controller;


import cn.ce.st.framework.base.ErrorResponseData;
import cn.ce.st.framework.base.Pagination;
import cn.ce.st.framework.base.ResponseData;
import cn.ce.st.framework.base.SuccessResponseData;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;
import cn.ce.st.service.PayFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (PayFlow)表控制层
 *
 * @author houxi
 * @since 2019-04-14 13:25:28
 */
@RestController
@RequestMapping("payFlow")
@Slf4j
public class PayFlowController {
    /**
     * 服务对象
     */
    @Autowired
    private PayFlowService payFlowService;

    /**
     *
     * @return
     */
    @PostMapping("findAll")
    public ResponseData findAll(@RequestBody PayFlowReq payFlowReq){
        try {
            Pagination<PayFlowRes> all = payFlowService.findAll(payFlowReq);
            return new SuccessResponseData(all);
        } catch (Exception e) {
            log.error(e.getMessage());
            ErrorResponseData errorResponseData = new ErrorResponseData("查询付款流水单列表失败");
            errorResponseData.setExceptionClazz(e.getMessage());
            return errorResponseData;
        }
    }

}