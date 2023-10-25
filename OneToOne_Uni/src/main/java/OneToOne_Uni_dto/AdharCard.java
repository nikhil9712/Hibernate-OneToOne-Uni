package OneToOne_Uni_dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="a_card")  //modify table name it by default is classname
public class AdharCard {
    
	@Id
	@Column(name="a_id") //change primary key column by default is id
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
