package org.springframework.beans.factory.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.*;

class XmlBeanFactoryTest {
	@Test
	public void testSimpleLoad(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("lx/beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
		assertEquals("testStr",bean.getTestStr());

	}

	public static class MyTestBean{
		private String testStr = "testStr";

		public String getTestStr() {
			return testStr;
		}

		public void setTestStr(String testStr) {
			this.testStr = testStr;
		}
	}


}