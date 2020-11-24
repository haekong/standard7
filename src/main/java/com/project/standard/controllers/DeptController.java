package com.project.standard.controllers;

import com.project.standard.models.DeptDTO;
import com.project.standard.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    DeptService deptService;


    @RequestMapping("/deptList")
    public String selectList(Model model) {
        List<DeptDTO> list = deptService.selectDept();
        System.out.println(list);
        model.addAttribute("list", list);
        return "list";
    }


}