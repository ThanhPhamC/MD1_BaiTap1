package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("TransferController")
public class TransferController {
    @PostMapping("result")
    public ModelAndView result(int money, int quantity){
        ModelAndView mav=new ModelAndView("trans");
        int result;
        String resultView = null;
        if (money==1){
            result=quantity*24500;
            resultView=result+" vnd";
        } else if (money==2) {
            result=quantity/24500;
            resultView=result+" usd";
        }
        mav.addObject("resultView",resultView);
        return mav;

    }
}
