//package io.demo1;
//
//import com.thunisoft.ygyd.yj.service.UploadFromDiskService;
//import io.swagger.annotations.Api;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//
///**
// * 标题: 批量导入药品信息(图片+用途)
// *
// * @Author: Jiang yuting
// * @Date: 2020/11/25 14:55
// */
//@Slf4j
//@RestController
//@RequestMapping("/api/v1.0/uploadfromdisk")
//@Api(value = "UploadFromDiskController", tags = {"批量上传图片"})
//public class UploadFromDiskController {
//    @Autowired
//    private UploadFromDiskService uploadFromDiskService;
//
//    @GetMapping("/uploadimg")
//    public void uploadImg() {
//        try {
//            uploadFromDiskService.uploadImg();
//        } catch (IOException e) {
//            log.error("批量上传图片失败",e);
//        }
//    }
//
//}
//
