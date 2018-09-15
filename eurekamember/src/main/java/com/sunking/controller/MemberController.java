package com.sunking.controller;


import com.sunking.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private memberService memberService;

    @RequestMapping("/getMember")
    public List<String> getMember(){
        return  memberService.getMember();
    }

    @RequestMapping("/getMemberService")
    public String getMemberService(){
        return "this is getMemberService";
    }
}
