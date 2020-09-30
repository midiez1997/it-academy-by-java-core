package com.company.sedun;

public class Main {

    public static void main(String[] args) {
	int s = 3700;
	int sec;
	int m;
	int min, h;
	int sut;
	int weeks;
	int weeks2;
	int l;
	sec = s % 60;
	m = (s-sec) / 60;
	min = m%60;
	h = (m-min) / 60;
    sut = h%24;
    l = (h-sut) / 24;
    weeks = l%7;
    weeks2 = (l-weeks) / 7;
	System.out.println(h + " часов " + min + " минут " + sec + " секунд " + sut + " суток " + weeks2 + " недель ");// write your code here
    }
}
