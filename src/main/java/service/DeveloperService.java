package service;

import dao.hibernate.HibernateDeveloperDAOImpl;
import model.Developer;

public class DeveloperService {
    HibernateDeveloperDAOImpl hibernateDeveloperDAO;
    public DeveloperService(){
       hibernateDeveloperDAO = new HibernateDeveloperDAOImpl();
    }
    public void create(Developer developer){
        hibernateDeveloperDAO.create(developer);
    }
}