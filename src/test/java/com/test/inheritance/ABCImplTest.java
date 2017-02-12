package com.test.inheritance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.contains;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ABCImplTest {

	private ABCImpl abcImpl;

	@Before
	public void setup() {
		abcImpl = new ABCImpl();
	}

	@Test
	public void testGetSrc() throws Exception {
		List<String> result = abcImpl.getSrc(new DEF(), new XYZ());
		assertThat((Collection<String>) result, is(not(empty())));
		assertThat(result, contains("default", "another-default"));
	}
	

	@Test
	public void testABCImplGetSrc() throws Exception {
		List<String> result = abcImpl.getSrcImpl(new DEF(), new XYZ());
		assertThat((Collection<String>) result, is(not(empty())));
		assertThat(result, contains("default", "another-default", "implementation"));
	}
}
