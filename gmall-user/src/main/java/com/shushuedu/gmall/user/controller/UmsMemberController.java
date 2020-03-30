package com.shushuedu.gmall.user.controller;

import com.shushuedu.gmall.user.bean.UmsMember;
import com.shushuedu.gmall.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UmsMemberController {
    @Resource
    UmsMemberService umsMemberService;

    @GetMapping("/getall")
    @ResponseBody
    public List<UmsMember> getall(){
        return umsMemberService.list(null);
    }


}

