package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  jdbc启动成功   ლ(´ڡ`ლ)ﾞ  \n"+
                " .-------.       ____     __        \n"+
                " |  _ _   \\      \\   \\   /  /    \n"+
                " | ( ' )  |       \\  _. /  '       \n"+
                " |(_ o _) /        _( )_ .'         \n"+
                " | (_,_).' __  ___(_ o _)'          \n"+
                " |  |\\ \\  |  ||   |(_,_)'         \n"+
                " |  | \\ `'   /|   `-'  /           \n"+
                " |  |  \\    /  \\      /           \n"+
                " ''-'   `'-'    `-..-'              ");
    }

}
