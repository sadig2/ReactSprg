
package com.clanzu2.ppmtool.repositories;

import com.clanzu2.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

   Project findByProjectIdentifier(String project);
    
    
}
