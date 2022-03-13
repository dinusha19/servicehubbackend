package com.web418.servicehubbackend.Repository;

import com.web418.servicehubbackend.entity.PostRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


public interface PostRequirementRepository extends CrudRepository<PostRequirement,Integer> {
}