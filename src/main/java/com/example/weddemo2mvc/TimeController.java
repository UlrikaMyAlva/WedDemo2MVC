package com.example.weddemo2mvc;


import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {

    @GetMapping("/time")
    public String getTime(Model m){
        m.addAttribute("timestring", LocalDateTime.now());
        return "timepage"; //Bara det symboliska namnet, skriv ej .html
    }

}
