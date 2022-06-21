package application;

import java.util.Date;

public class Order {
	private int id;
	private String code;
	private Date orderTime;
	private Date cretionDate;
	private int idClient;
	private int status;
	private Date closeDate;
	private int timeProkat;
	public Order(int id, String code, Date orderTime, Date cretionDate, int idClient, int status, Date closeDate,
			int timeProkat) {
		super();
		this.id = id;
		this.code = code;
		this.orderTime = orderTime;
		this.cretionDate = cretionDate;
		this.idClient = idClient;
		this.status = status;
		this.closeDate = closeDate;
		this.timeProkat = timeProkat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getCretionDate() {
		return cretionDate;
	}
	public void setCretionDate(Date cretionDate) {
		this.cretionDate = cretionDate;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public int getTimeProkat() {
		return timeProkat;
	}
	public void setTimeProkat(int timeProkat) {
		this.timeProkat = timeProkat;
	}
}
