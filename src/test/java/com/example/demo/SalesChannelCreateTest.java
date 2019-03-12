package com.example.demo;

import com.example.demo.saleschannel.SalesChannel;
import com.example.demo.saleschannel.SalesChannelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SalesChannelCreateTest {

    SalesChannelService service;

    @Before
    public void before(){
        service = new SalesChannelService();
    }

    @Test
    public void test(){
        SalesChannel salesChannel = new SalesChannel();
        SalesChannel result = service.insert(salesChannel);
        Assert.assertEquals("insert success",result,salesChannel);
        Assert.assertEquals("result 生成code",result.getCode(),"1");
    }

}
