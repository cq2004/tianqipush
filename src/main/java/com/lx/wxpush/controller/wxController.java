package com.lx.wxpush.controller;


import com.lx.wxpush.constant.ConfigConstant;
import com.lx.wxpush.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class wxController {

    @Autowired
    private ConfigConstant configConstant;

    @Autowired
    private SendService sendService;



    /**
     * 获取Token
     * 每天早上7：30执行推送
     * @return
     */
    @Scheduled(cron = "0 00 8 ? * *")
    @RequestMapping("/send")
    public String send() {
        return sendService.sendWeChatMsg();
    }



    @RequestMapping("/changeConfig")
    public void changeConfig(String city,String time, HttpServletResponse response) throws IOException {
        if (city.contains("省")||city.contains("市")||city.contains("区")||city.contains("县")) {
            configConstant.setCity(city.substring(0,city.length()-1));
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/text");
        response.getWriter().write("更新成功");
    }




}