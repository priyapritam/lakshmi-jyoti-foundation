package org.pritam.lakshmi_jyoti_foundation.dio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaintenanceController {

    @GetMapping("/")
    public String maintenancePage(){
        return "maintenance";
    }
}
