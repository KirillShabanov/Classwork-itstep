package org.itstep.springthymeleafupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @GetMapping(value={"/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping(value="/index")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        //System.out.println(fileName);
        File dir = new File("src/main/resources/uploaded");
        file.transferTo(new File(dir.getAbsolutePath()
                +"/"
                +fileName));
        return "index";
    }
}
