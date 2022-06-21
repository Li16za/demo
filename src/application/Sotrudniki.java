package application;
import java.util.Date;

public class Sotrudniki {
	private int id;
	private String fio;
	private int role;
	private String login;
	private String password;
	private Date last_sing_in;
	private int type_sign_in;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLast_sing_in() {
		return last_sing_in;
	}
	public void setLast_sing_in(Date last_sing_in) {
		this.last_sing_in = last_sing_in;
	}
	public int getType_sign_in() {
		return type_sign_in;
	}
	public void setType_sign_in(int type_sign_in) {
		this.type_sign_in = type_sign_in;
	}
	public Sotrudniki(int id, String fio, int role, String login, String password, Date last_sing_in,
			int type_sign_in) {
		super();
		this.id = id;
		this.fio = fio;
		this.role = role;
		this.login = login;
		this.password = password;
		this.last_sing_in = last_sing_in;
		this.type_sign_in = type_sign_in;
	} 
}
