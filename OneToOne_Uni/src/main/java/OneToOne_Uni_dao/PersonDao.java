package OneToOne_Uni_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import OneToOne_Uni_dto.AdharCard;
import OneToOne_Uni_dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("Nikhil").createEntityManager();
	}

	public void insertperson(Person per) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		AdharCard a = per.getAdharcard();

		entityTransaction.begin();
		entityManager.persist(a);
		entityManager.persist(per);
		entityTransaction.commit();
	}

	public void deletePerson(int id) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, id);

		AdharCard aadharCard = person.getAdharcard();
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(aadharCard);
		entityTransaction.commit();

	}

	public void display(int personid) {

		EntityManager entityManager = getEntityManager();

		Person person = entityManager.find(Person.class, personid);
		System.out.println(person);
	}

	public void displayAll() {

		EntityManager entityManager = getEntityManager();

		Query query = entityManager.createQuery("select p from Person p ");
		List<Person> list = query.getResultList();
		System.out.println(list);

	}

	public void update(int id, Person p) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person p2 = entityManager.find(Person.class, id);

		if (p2 != null) {
			p.setId(id);
			p.setAdharcard(p2.getAdharcard());
			entityTransaction.begin();
			entityManager.merge(p);
			entityTransaction.commit();
		} else {
			System.out.println("Person not Found !!");
		}
	}

	public void updatePerson(int personid, int adharId) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person p1 = entityManager.find(Person.class, personid);
		AdharCard a1 = entityManager.find(AdharCard.class, adharId);

		p1.setAdharcard(a1);

		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();

	}
}
