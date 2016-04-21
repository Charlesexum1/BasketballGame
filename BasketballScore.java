/*
 * BasketballScore.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 */


public class BasketballScore {
	
	private String team1, team2;
	private int team1Score, team2Score;
	private String status;
	
	public void setTeams(String newTeam1, String newTeam2){
		team1 = newTeam1;
		team2 = newTeam2;
		}
	
	public void updateStatus(){
		if (team1Score > team2Score){
			status = "team 1 wins!";
			}
		else if (team1Score == team2Score) {
			status = "tied game";
			}
		else {
			status = "team 2 wins!";
			}		
		}
	
	public void onePointt1(){
		team1Score += 1;
		}
	public void twoPointt1(){
		team1Score += 2;
		}
	public void threePointt1(){
		team1Score += 3;
		}
		
	public void onePointt2(){
		team2Score += 1;
		}
	public void twoPointt2(){
		team2Score += 2;
		}
	public void threePointt2(){
		team2Score += 3;
		}	
		
	public String getTeam1(){
		return team1;
		}
	public String getTeam2(){
		return team2;
		}
					
	public int getTeam1Score(){
		return team1Score;
		}
	public int getTeam2Score(){
		return team2Score;
		}
	
	public String getStatus(){
		return status;
		}			
	
	public static void main (String args[]) {
		
	}
}

