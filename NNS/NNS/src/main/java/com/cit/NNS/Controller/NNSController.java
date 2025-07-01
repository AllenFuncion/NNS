package com.cit.NNS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NNSController {

    @GetMapping("/home")
    public String home() {
        return "NNSindex";
    }
    
    @GetMapping("/enrollment")
    public String enrollmentPage() {
        return "enrollment";
    }

    @GetMapping("/documents")
    public String documentsPage() {
        return "documents";
    }

    @GetMapping("/career")
    public String careerPage() {
        return "career";
    }

    @GetMapping("/mental-health")
    public String mentalHealthPage() {
        return "mental-health";
    }
}
