package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Emprunts;
import edu.colval.exercises.td60.dal.Repository_Emprunts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Emprunts {
    @Autowired
    private Repository_Emprunts repositoryEmprunts;

    public Repository_Emprunts getRepositoryEmprunts() {
        return repositoryEmprunts;
    }

    public void setRepositoryEmprunts(Repository_Emprunts repositoryEmprunts) {
        this.repositoryEmprunts = repositoryEmprunts;
    }

    public void save(Emprunts emprunts) {
        repositoryEmprunts.save(emprunts);
    }
}
