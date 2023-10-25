package MainController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOne_Uni_dao.PersonDao;
import OneToOne_Uni_dto.AdharCard;
import OneToOne_Uni_dto.Person;

public class Main {

	public static void main(String[] args) {

		AdharCard ad = new AdharCard();
		ad.setId(123459);
		ad.setName("Pratik gulhane");
		ad.setAddress("Civil lines,Yavatmal");
		
		Person p = new Person();
		p.setId(103);
		p.setName("Pratik gulhane");
		p.setPhno(9854261478l);
		
		
		p.setAdharcard(ad);
		
	
		PersonDao personDao=new PersonDao();
	  
		
//		personDao.insertperson(p);
//		personDao.deletePerson(104);
//		personDao.display(102);
//		personDao.displayAll();
//		personDao.update(102, p); //existing id new person details //102will be updated 
		personDao.updatePerson(102, 123456); //adhar card is updated with the help of person
		//person can not be null passes adhar card is set to that adhar card
//	  
	}
}
