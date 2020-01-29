package com.clanzu2.ppmtool.services;

import com.clanzu2.ppmtool.domain.Project;
import com.clanzu2.ppmtool.exceptions.ProjectIdException;
import com.clanzu2.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    
    @Autowired
    private  ProjectRepository projectRepository;
    
    public Project saveOrUpdateProject(Project project){
        
        try{
            
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch(Exception e){
            throw new ProjectIdException("Project id "+project.getProjectIdentifier()+"'already exists'");
        }
        
    }
    
    
    public Project findProjectByIdentifier(String projectId){
        
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        
        if (project==null){
            throw new ProjectIdException(projectId  + " does not exist");
        }
        
         return project;
    }
    
    public Iterable<Project> findAllProjects(){
        Iterable<Project> projects = projectRepository.findAll();
        return projects;
    }
    
    public void deleteProjectByIdentifier(String projectId){
        Project project = projectRepository.findByProjectIdentifier(projectId);
        
        if(project==null){
            throw new ProjectIdException(projectId+"can not delete this project ");
        }
        
        projectRepository.delete(project);
    }
    
   
}
