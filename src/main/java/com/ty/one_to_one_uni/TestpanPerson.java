package com.ty.one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestpanPerson {
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			Person person=new Person();
			person.setName("kumara");
			person.setEmail("kumara@9844");
			person.setPhone(9844648667l);
			
			Pan pan=new Pan();
			pan.setName("Kumara BL");
			pan.setAddress("Hassan");
			pan.setPanNumber("kuma859Ty");
			
			person.setPan(pan);
			
			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(pan);
			entityTransaction.commit();
			
			System.out.println("Done");
		}
}
