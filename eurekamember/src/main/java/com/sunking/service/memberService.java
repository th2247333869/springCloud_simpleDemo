package com.sunking.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class memberService {


    public List<String> getMember(){

        String str1 = new String("會員一");
        String str2 = new String("會員二");

        List<String> list = new ArrayList<>();

        list.add(str1);
        list.add(str2);

        return list;
    }


}
