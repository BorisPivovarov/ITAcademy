//package hw33.controller;
//
//
//import hw33.dto.ResultDto;
//import hw33.service.ConverterService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.math.BigDecimal;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/converter")
//public class InputController {
//
//
//    @Value("${spring.application.name}")
//    private String application;
//
//    private final ConverterService converterService;
//
//
//    @PostMapping
//    public ResultDto result(@RequestParam("arg1") BigDecimal a,@RequestParam("arg2") String b) {
//        return new ResultDto(application, converterService.result(a, b));
//    }
//}
