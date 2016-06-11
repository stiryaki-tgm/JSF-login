package model;

import java.util.Random;

public class Card {
	private int left;
	private int right;
	private int result;

	public Card() {
		init();
	}

	// Controller

	public String show() {
		result = left * right;
		return "show";
	}

	private void init() {
		result = 0;
		// TODO left und right zufaellig befuellen
		
	}

	public String next() {
		init();
		return "next";
	}

	// getter and setter

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}