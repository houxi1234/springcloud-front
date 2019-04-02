package cn.ce.st.service.impl;

import cn.ce.st.service.TestService;
import cn.ce.st.service.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Descrition TODO
 * @Author houxi
 * @Date 2019/4/2 17:27
 * Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestApi testApi;

    @Override
    public String getTest() {
        return this.testApi.test().toString();
    }
}
