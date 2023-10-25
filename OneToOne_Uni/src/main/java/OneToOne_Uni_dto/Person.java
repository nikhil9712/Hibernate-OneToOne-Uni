package OneToOne_Uni_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private long phno;
	@OneToOne
	private AdharCard adharcard;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + ", adharcard=" + adharcard + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public AdharCard getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(AdharCard adharcard) {
		this.adharcard = adharcard;
	}

}
