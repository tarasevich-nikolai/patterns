package com.tarasevich.nikolai.behaviour.chains_of_responsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}