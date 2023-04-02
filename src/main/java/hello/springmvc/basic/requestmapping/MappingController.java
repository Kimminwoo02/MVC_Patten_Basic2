package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {
    @RequestMapping(value = "/hello-basic",method = RequestMethod.GET)
    public String hellobasic(){
        log.info("hello basic");
        return "ok";
    }

    /**
     *
     * @return
     */
    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2(){
        log.info("hello basic");
        return "ok";
    }

    /**
     *  변수명이 같으면 생략 가능
     * @return
     */
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable String userId){
        log.info("mappingPath userId={}",userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId){
        log.info("mappingPath userId={}, orderId ={}",userId,orderId);
        return "ok";
    }

    @GetMapping(value = "/mapping-param",params = "mode=debug")
    public String mappingParam(){
        log.info("mappingParam");
        return "ok";
    }

    @GetMapping(value = "/mapping-header",headers = "mode=debug")
    public String mappingHeader(){
        log.info("mappingHeader");
        return "ok";
    }

    @PostMapping(value = "/mapping-consume",consumes = "application/json")
    public String mappingConsume(){
        log.info("mappingConsumes");
        return "ok";
    }

    @PostMapping(value = "/mapping-produce",produces = "text/html")
    public String mappingProduces(){
        log.info("mappingProduces");
        return "ok";
    }

}
