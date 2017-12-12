package com.arcadia.action;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by fet on 2017/11/25.
 */
@Controller
public class FrameAction {

    @RequestMapping("/")
    public String index(Locale locale, Model model){
        model.addAttribute("greeting", "Hello!");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        return "index";

    }
}
