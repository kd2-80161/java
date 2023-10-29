/**
 * 
 */
package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choice = 1;
		while (choice != 0) {
			System.out.println("--------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new Candidate");
			System.out.println("2. Delete given Candidate");
			System.out.println("3. Update Candidate");
			System.out.println("4. Increment Candidate vote");
			System.out.println("5. Display all Candidates");
			System.out.println("6. Get Party wise vote count");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("--------------------------------------");
			switch (choice) {
			case 1: {
				Candidate c = new Candidate();
				System.out.println("Enter Details of Candidates");
				System.out.println("Enter Name");
				c.setName(new Scanner(System.in).next());
				System.out.println("Enter Party");
				c.setParty(new Scanner(System.in).next());
				try (CandidateDao dao = new CandidateDao()) {
					int cnt = dao.addCandidate(c);
					System.out.println("Rows Affected " + cnt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				System.out.println("Enter Id of Candidate");
				int id = new Scanner(System.in).nextInt();
				try (CandidateDao dao = new CandidateDao()) {
					int cnt = dao.deleteById(id);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
				break;
			case 3: {
				Candidate c = new Candidate();
				System.out.println("Enter Details of Candidates");
				System.out.println("Enter Id");

				c.setId(new Scanner(System.in).nextInt());
				System.out.println("Enter Name");
				c.setName(new Scanner(System.in).next());
				System.out.println("Enter Party");
				c.setParty(new Scanner(System.in).next());
				try (CandidateDao dao = new CandidateDao()) {
					int cnt = dao.modifyCandidate(c);
					System.out.println("Rows Affected " + cnt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			break;
			case 4:{
				System.out.println("Enter Id of Candidate");
				int id = new Scanner(System.in).nextInt();
				try (CandidateDao dao = new CandidateDao()) {
					int cnt = dao.incrementVotes(id);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			break;
			case 5:{
				
				try{
					CandidateDao dao=new CandidateDao();
					List<Candidate> list=new ArrayList<Candidate>();
					list=dao.displayAll();
					list.forEach(m->System.out.println(m));
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			break;
			case 6:{
				List<PartyVotes> list=new ArrayList<PartyVotes>();
				try(CandidateDao dao=new CandidateDao()){
					list=dao.getPartyVotes();
					list.forEach(m->System.out.println(m));
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			break;
			default:System.out.println("Wrong choice......");
			break;
			}
		}

	}

}
