package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkbookController {

    @GetMapping("/")
    public String getName(Model model) {
        model.addAttribute("name", "Mike");
        return "name-list";
    }
}
