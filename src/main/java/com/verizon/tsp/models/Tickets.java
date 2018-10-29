package com.verizon.tsp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class Tickets {
	
	@Id
	private long ticketId;
	
	
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
	
	private TicketType ticketType;
	 private String content;
	 private String status;
	 
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "planId", nullable = false)
	 private PlanDetails plan;
	 
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "tcId", nullable = false)
	 private TelecomCircle tc;
	 
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "csaId", nullable = false)
	 private CSA csa;
	public long getTicketId() {
		return ticketId;
	}
	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Tickets(long ticketId, User user, TicketType ticketType, String content, String status, PlanDetails plan,
			TelecomCircle tc,CSA csa) {
		super();
		this.ticketId = ticketId;
		this.user = user;
		this.ticketType = ticketType;
		this.content = content;
		this.status = status;
		this.plan = plan;
		this.tc = tc;
		this.csa=csa;
	}
	public PlanDetails getPlan() {
		return plan;
	}
	public void setPlan(PlanDetails plan) {
		this.plan = plan;
	}
	public TelecomCircle getTc() {
		return tc;
	}
	public void setTc(TelecomCircle tc) {
		this.tc = tc;
	}
	public CSA getCsa() {
		return csa;
	}
	public void setCsa(CSA csa) {
		this.csa = csa;
	}
	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

}
