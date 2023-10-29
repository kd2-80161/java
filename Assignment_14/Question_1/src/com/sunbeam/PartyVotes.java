package com.sunbeam;

public class PartyVotes {
	private int votes;
	private String party;
	public PartyVotes() {
		// TODO Auto-generated constructor stub
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public PartyVotes(int votes, String party) {
		super();
		this.votes = votes;
		this.party = party;
	}
	@Override
	public String toString() {
		return "PartyVotes [votes=" + votes + ", party=" + party + "]";
	}
	
}
