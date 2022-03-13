package com.web418.servicehubbackend.service;

import com.web418.servicehubbackend.Repository.PostRequirementRepository;
import com.web418.servicehubbackend.entity.PostRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostRequirementService {

    @Autowired(required = true)
    public PostRequirementRepository postRequirementRepository;

    public PostRequirement savePostRequirement(PostRequirement postRequirement) {

        return postRequirementRepository.save(postRequirement);
    }
}