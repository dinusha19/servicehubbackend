package com.web418.servicehubbackend.controller;

import com.web418.servicehubbackend.entity.PostRequirement;
import com.web418.servicehubbackend.service.PostRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/postrequirement")
public class PostRequirementController {

    @Autowired(required = true)
    private PostRequirementService postRequirementService;

    @PostMapping("/addPostRequirement")
    public ResponseEntity<String> addPostRequirement(@RequestBody PostRequirement postRequirement) {
        PostRequirement postRequirement1;
        try {
            postRequirement1 = postRequirementService.savePostRequirement(postRequirement);
            return new ResponseEntity<String>("Post Requirement Details Added Successfully", HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<String>("Post Requirement Details Not Added", HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/getPostRequirements")
    public ResponseEntity<ArrayList<PostRequirement>> getPostRequirements() {

        ArrayList<PostRequirement> postRequirements = null;
        try {
            postRequirements = postRequirementService.getPostRequirements();

            return new ResponseEntity<ArrayList<PostRequirement>>(postRequirements, HttpStatus.OK);


        } catch (Exception ex) {
            return null;
        }

    }
}
