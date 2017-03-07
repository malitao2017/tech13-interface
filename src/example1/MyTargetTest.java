/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech13@interface
 * 描述信息: 
 * 创建日期：2015年12月14日 下午6:41:11 
 * @author malitao
 * @version 
 */
package example1;

import java.lang.reflect.Method;

/** 
 *  
 * 创建日期：2015年12月14日 下午6:41:11 
 * @author malitao
 */
public class MyTargetTest {
	@MyTarget
	public void doSomething(){
		System.out.println("hello world");
	}
	
	public static void main(String[] args) throws Exception {
		Method method = MyTargetTest.class.getMethod("doSomething", null);
		//如果doSomething方法上存在注解@MyTarget，则为true
		//上面程序打印：@com.self.MyTarget()，如果RetentionPolicy值不为RUNTIME,则不打印。  
		if(method.isAnnotationPresent(MyTarget.class)){
			System.out.println(method.getAnnotation(MyTarget.class));  
		}
	}
}
