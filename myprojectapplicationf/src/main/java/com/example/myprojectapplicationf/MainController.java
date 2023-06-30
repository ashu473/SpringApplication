package com.example.myprojectapplicationf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    CredentialRepository credentialRepository;

    @Autowired
    UserdetailRepository userdetailRepository;

    @Autowired
    UsertypelinkRepository usertypelinkRepository;


    @GetMapping("/land")
    public String landingpage(){
        return "landingpage";
    }

    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username,@RequestParam("password") String password){
        Credential credential=new Credential();
        credential.setUsername(username);
        credential.setPassword(password);

        credentialRepository.save(credential);
        return "landingpage";
    }

    @PostMapping("/userdetails")
    public String userdetails(@RequestParam("username") String username,@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("email") String email,@RequestParam("phone") String phone,HttpSession session){
        Userdetail userdetail=new Userdetail();
        userdetail.setUsername(username);
        userdetail.setFname(fname);
        userdetail.setLname(lname);
        userdetail.setEmail(email);
        userdetail.setPhone(phone);

        userdetailRepository.save(userdetail);
        return "usertypelink";
    }



    @PostMapping("/usertypelink")
    public String usertypelink(@RequestParam("username") String username,@RequestParam("usertype") String usertype,HttpSession session){
        Usertypelink usertypelink=new Usertypelink();
        usertypelink.setUsername(username);
        usertypelink.setUsertype(usertype);

        usertypelinkRepository.save(usertypelink);
        return "landingpage";

    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session,Model model){
        Optional<Credential> matchCredential=credentialRepository.findById(username);
        if(matchCredential.isPresent())
        {
            if(matchCredential.get().getPassword().equals(password))
            {
                session.setAttribute("username",username);
//                Optional<Userdetail> userdetail=userdetailRepository.findById(username);
//                userdetail.ifPresent(value -> model.addAttribute("uerdetail", value));
                return "dashboard";
            }else{
                return "landingpage";
            }
        }
        return "landingpage";
    }
}