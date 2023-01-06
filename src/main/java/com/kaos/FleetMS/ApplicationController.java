package com.kaos.FleetMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/layout")
    public String layout(){
        return "layout";
    }

    @GetMapping("/accounts")
    public String accountsDept() {
        return "/accounts/index";
    }
    @GetMapping("/fleet")
    public String fleetDept() {
    return "/fleet/index";
    }
    @GetMapping("/helpdesk")
    public String helpdeskDept(){
        return "/helpdesk/index";
    }

    @GetMapping("/hr")
    public String hrDept(){
        return "/hr/index";
    }
    @GetMapping("/parameters")
    public String parametersDept(){
        return "/parameters/index";
    }
    @GetMapping("/payroll")
    public String payrollDept(){
        return "/payroll/index";
    }
}
