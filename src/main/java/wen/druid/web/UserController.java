package wen.druid.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wen.druid.service.CustomUserService;
import wen.druid.service.MasterUserService;

@RestController
public class UserController {

    @Autowired
    private MasterUserService masterUserService;

    @Autowired
    private CustomUserService customUserService;

    @RequestMapping("/master/select")
    public Object getMasterUser(@RequestParam Integer id) {
        return masterUserService.getMasterUser(id);
    }

    @RequestMapping("/master/insert")
    public Object insertMasterUser() {
        return masterUserService.insert();
    }

    @RequestMapping("/master/transaction")
    @Transactional
    public Object masterTransaction() {
        int insertResult = masterUserService.insert();
        return insertResult;
    }

    @RequestMapping("/custom/select")
    public Object getCustomUser(@RequestParam Integer id) {
        return customUserService.getCustomUser(id);
    }

    @RequestMapping("/custom/insert")
    public Object insertCustomUser() {
        return customUserService.insert();
    }

    @RequestMapping("/custom/transaction")
    @Transactional("customTransactionManager")
    public Object customTransaction() {
        int insertResult = customUserService.insert();
        return insertResult;
    }

}
