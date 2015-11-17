package com.sample.myspring.beans.test;

import org.junit.Before;
import org.junit.Test;

import com.sample.myspring.beans.ValidateBeans;

public class ValidateBeansTest {

	// private ValidateBeans validate;

	@Before
	public void setUp() throws Exception {
		// validate = new ValidateBeans();
	}

	@Test
	public void testValidateRegular() {
		ValidateBeans.validateRegular();
	}

	@Test
	public void testValidateSpring() {
		ValidateBeans.validateSpringFileSystemContext();
	}
}
