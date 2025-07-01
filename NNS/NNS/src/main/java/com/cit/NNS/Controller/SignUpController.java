package com.cit.NNS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cit.NNS.Model.User;
import com.cit.NNS.repository.UserRepository;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String showSignUpForm() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@RequestParam String username,
                         @RequestParam String password,
                         Model model) {
        if (userRepository.existsByUsername(username)) {
            model.addAttribute("error", "This Gmail is already registered.");
            return "signup";
        }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password); 
        userRepository.save(newUser);

        model.addAttribute("success", "Account created successfully. You can now log in.");
        return "signup";
    }
}
