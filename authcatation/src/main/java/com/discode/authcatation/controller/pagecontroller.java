package com.discode.authcatation.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.discode.authcatation.entity.signupform;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class pagecontroller {

    @Autowired
    private Cloudinary cloudinary;

    @RequestMapping("/login")
    public String loginpage() {

        return "login";
    }

    @GetMapping("/signup")
    public String signuppage(Model model) {
        model.addAttribute("signupform", new signupform());
        return "signup";
    }

    @PostMapping("/signup")
    public String postMethodName(@ModelAttribute signupform signupform, RedirectAttributes redirectAttributes) {
        MultipartFile file = signupform.getFile();
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload.");
            return "redirect:/signup";
        }
        try {
            // Upload the file to Cloudinary
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            String url = uploadResult.get("url").toString();
            System.out.println(url);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'.");
            redirectAttributes.addFlashAttribute("url", url);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/login";
    }

}
