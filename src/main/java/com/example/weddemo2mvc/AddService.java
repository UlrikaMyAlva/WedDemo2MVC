package com.example.weddemo2mvc;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope //Onödig/default
public class AddService {

    public int add(int a, int b){
        return a + b;
    }

}
