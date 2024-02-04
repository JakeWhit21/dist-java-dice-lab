package edu.wctc.dice;

import edu.wctc.dice.iface.DieRoller;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameInput gameInput() {
        return new ConsoleInput();
//        return new PopupInput();
    }

    @Bean
    public GameOutput gameOutput() {
        return new ConsoleOutput();
//        return new PopupOutput();
    }

    @Bean
    public DieRoller dieRoller() {
//        return new EightSidedDie();
        return new TwelveSidedDie();
    }

    //die roller will go here as interface
    //similar to how the gameoutput and gameinput beans are with console and popup output

}
