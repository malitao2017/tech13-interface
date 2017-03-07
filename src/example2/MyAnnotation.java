/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech13@interface
 * 描述信息: 
 * 创建日期：2015年12月14日 下午6:46:32 
 * @author malitao
 * @version 
 */
package example2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//import example2.bean.TestAnnotation;
//import example2.bean.TrafficLamp;

/** 
 *  
 * 创建日期：2015年12月14日 下午6:46:32 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String hello() default "hello";
	String world();
	//以下类同
//	int[]array() default { 2, 4, 5, 6 };
////	EnumTest.TrafficLamp lamp() ;
//	TrafficLamp lamp() ;
//	TestAnnotation lannotation() default @TestAnnotation(value = "ddd");
//	Class style() default String.class;
}
