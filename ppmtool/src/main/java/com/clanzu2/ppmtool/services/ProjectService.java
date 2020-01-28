package com.clanzu2.ppmtool.services;

import com.clanzu2.ppmtool.domain.Project;
import com.clanzu2.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    
    @Autowired
    private  ProjectRepository projectRepository;
    
    public Project saveOrUpdateProject(Project project){
        
        
        
        return projectRepository.save(project);
    }
    
}