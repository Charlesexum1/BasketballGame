/*
 * BasketballGame.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class BasketballGame extends BasketballScore {
	
	public static void main (String args[]) {
		BasketballGame demo = new BasketballGame();
		demo.setTeams("Rhinos", "Pine Trees");
		System.out.println(demo.getTeam1() + " versus " + demo.getTeam2());
		demo.threePointt1();
		demo.onePointt2();
		demo.threePointt2();
		demo.updateStatus();
		System.out.println(demo.getTeam1() + ": " + demo.getTeam1Score());
		System.out.println(demo.getTeam2() + ": " + demo.getTeam2Score());
		System.out.println(demo.getStatus());
		
	}
}

