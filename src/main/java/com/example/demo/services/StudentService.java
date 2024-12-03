package com.example.demo.services;

import com.example.demo.Student;
import com.example.demo.resposities.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    //@Autowired private EntityManager entityManager;
    @Autowired private StudentRepository studentRepository;

    public StudentService(){}


    @Transactional
    public void create(Student student) {
        studentRepository.save(student);
        //entityManager.persist(student);
        /*EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            em.close();

        }*/
    }
}
